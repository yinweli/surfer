package next.server.util.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * �е�:���w�A�ȱa���Ұʨ禡
 * </pre>
 * 
 * @author yinweli
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ServiceStart
{
    // do nothing...
}