import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodsDemo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        SomeClass someClass = new SomeClass();
        Class itemClass = someClass.getClass();


        Method[] methods = itemClass.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method.invoke(itemClass));
        }


    }
}