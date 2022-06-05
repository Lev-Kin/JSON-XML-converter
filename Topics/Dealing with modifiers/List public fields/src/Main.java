import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Get list of public fields the object declares (inherited fields should be skipped).
 */

class FieldGetter {

    public String[] getPublicFields(Object object) {
        List<String> list = new ArrayList<>();

        for (Field field : object.getClass().getDeclaredFields()) {
            if (Modifier.isPublic(field.getModifiers())) {
                list.add(field.getName());
            }
        }

        return list.toArray(new String[0]);
    }

}
