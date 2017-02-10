/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 * Aion-Lightning is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Aion-Lightning is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details. *
 *
 * You should have received a copy of the GNU General Public License along with
 * Aion-Lightning. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Credits goes to all Open Source Core Developer Groups listed below Please do
 * not change here something, ragarding the developer credits, except the
 * "developed by XXXX". Even if you edit a lot of files in this source, you
 * still have no rights to call it as "your Core". Everybody knows that this
 * Emulator Core was developed by Aion Lightning
 * 
 * @-Aion-Unique-
 * @-Aion-Lightning
 * @Aion-Engine
 * @Aion-Extreme
 * @Aion-NextGen
 * @Aion-Core Dev.
 */
package next.server.util.configuration.transformers;

import java.lang.reflect.Field;

import next.server.util.configuration.PropertyTransformer;
import next.server.util.configuration.TransformationException;

/**
 * This class is here just for writing less "ifs" in the code. Does nothing
 *
 * @author SoulKeeper
 */
public class StringTransformer implements PropertyTransformer<String>
{
    
    /**
     * Shared instance of this transformer. It's thread-safe so no need of
     * multiple instances
     */
    public static final StringTransformer SHARED_INSTANCE = new StringTransformer();
    
    /**
     * Just returns value object
     *
     * @param value value that will be transformed
     * @param field value will be assigned to this field
     * @return return value object
     * @throws TransformationException never thrown
     */
    @Override
    public String transform(String value, Field field) throws TransformationException
    {
        return value;
    }
}
