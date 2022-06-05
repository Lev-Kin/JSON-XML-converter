import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionUtils {

    public static int countPublicMethods(Class targetClass) {

        Method[] methods = targetClass.getDeclaredMethods();

        int count = 0;

        for (Method method : methods) {
            int modifiers = method.getModifiers();

            if (Modifier.isPublic(modifiers)) {
                count++;
            }

        }

        return count;
    }
}
