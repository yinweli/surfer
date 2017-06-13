﻿using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;

public class ExcelToSQLText : ExcelExport
{
    /// <summary>
    /// 項目設定物件
    /// </summary>
    private SettingItem settingItem = null;

    /// <summary>
    /// 資料表欄位列表
    /// </summary>
    private List<Field> excelFields = null;

    /// <summary>
    /// 目標檔案路徑
    /// </summary>
    private string filepath = "";

    /// <summary>
    /// 目標檔案內容列表
    /// </summary>
    private List<string> fileContent = new List<string>();

    protected override bool readField(List<string> notes, List<string> fields)
    {
        settingItem = SettingItem as SettingItem;

        if (settingItem == null)
            return Output.outputError(SettingItem.ToString(), "setting item fromat error");

        excelFields = fields.Select(itor => Field.parse(itor)).ToList();

        if (excelFields.Count <= 0)
            return Output.outputError(SettingItem.ToString(), "fields empty");

        if (excelFields.Any(itor => itor == null))
            return Output.outputError(SettingItem.ToString(), "fields error");

        filepath = Path.Combine(SettingPath.targetPath, settingItem.targetDatabase) + ".sqltext.txt";
        fileContent.Clear();

        // 刪除舊的資料表
        fileContent.Add("DROP TABLE IF EXISTS " + settingItem.targetTable);

        // 建立資料表
        string createSyntax = "";
        string primaryKeySyntax = "";

        foreach (Field itor in excelFields)
        {
            if (createSyntax.Length > 0)
                createSyntax += ", ";

            createSyntax += "\"" + itor.field + "\" " + itor.fieldType.fieldType();

            if (itor.primaryKey)
            {
                if (primaryKeySyntax.Length > 0)
                    primaryKeySyntax += ", ";

                primaryKeySyntax += "\"" + itor.field + "\"";
            } //if
        }//for

        if (primaryKeySyntax.Length > 0)
            fileContent.Add("CREATE TABLE " + settingItem.targetTable + " (" + createSyntax + ", PRIMARY KEY (" + primaryKeySyntax + "))");
        else
            fileContent.Add("CREATE TABLE " + settingItem.targetTable + " (" + createSyntax + ")");

        return true;
    }

    protected override bool readData(List<List<string>> datas)
    {
        foreach (List<string> itor in datas)
        {
            string insertSyntax = "";

            for (int i = 0; i < itor.Count; ++i)
            {
                if (insertSyntax.Length > 0)
                    insertSyntax += ", ";

                if (excelFields[i].fieldType.dbType() == DbType.String)
                    insertSyntax += "\"" + itor[i] + "\"";
                else
                    insertSyntax += itor[i];
            }//for

            fileContent.Add("INSERT INTO " + settingItem.targetTable + " VALUES (" + insertSyntax + ")");
        }//for

        return true;
    }

    protected override void readFinish()
    {
        File.AppendAllLines(filepath, fileContent);
    }
}