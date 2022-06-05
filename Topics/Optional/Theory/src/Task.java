// You can experiment here, it won’t be checked

import java.util.Formatter;
import java.util.function.Function;

public class Task {
  public static void main(String[] args) {
    Function<String, String> operator1 = s -> s + s;
    Function<String, String> operator2 = s -> String.valueOf(s.length());
    String resultOperator = operator1.compose(operator2).apply("test");

   // resultOperator.apply("test");

   // String str = new String(String.valueOf(resultOperator));

    System.out.println(resultOperator);

  }
}
