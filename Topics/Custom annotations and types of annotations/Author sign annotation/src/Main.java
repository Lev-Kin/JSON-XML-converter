import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String name();
}


class TestClass {

    @Author(name = "Jane Johnson")
    public void myMethod() {
        System.out.println("The method to test the @Author annotation");
    }

}