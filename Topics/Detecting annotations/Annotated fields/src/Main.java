import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */

class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        List<String> stringList = new ArrayList<>();
        Class itemClass = object.getClass();

        for (Field field : itemClass.getDeclaredFields()) {
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                stringList.add(field.getName());
            }
        }

        String[] array = {}; // конвертируем ArrayList в массив
        array = stringList.toArray(new String[stringList.size()]);

        return array;
    }

}
