import java.lang.annotation.Annotation;

class AnnotationUtils {

    public static void printClassAnnotations(Class classObject) {
        Annotation[] annotations = classObject.getDeclaredAnnotations();

        for (Annotation a : annotations)
            System.out.println(a.annotationType().getSimpleName());

    }
}

