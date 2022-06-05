import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Get sorted list of private fields the object declares (inherited fields should be skipped).
 */

class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        Field[] fieldsObject = object.getClass().getDeclaredFields();
        List<String> privateField = new ArrayList<>();

        for (Field field : fieldsObject) {
            int mod = field.getModifiers();
            if (Modifier.isPrivate(mod)) {
                privateField.add(field.getName());
            }
        }
        Collections.sort(privateField);

        return privateField;
    }

}
