// You can experiment here, it won’t be checked

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class Task {
  public static void main(String[] args) {
    File f = new File("D:\\z_TEmP\\dataset_91065.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(f));
      int count = 0;
      String str;
      while ((str = br.readLine()) != null) {
        int value = Integer.parseInt(str);
        if (value == 0) {
          break;
        } else if ((value & 1) == 0) {
          count++;
        }
      }
      out.println(count);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
