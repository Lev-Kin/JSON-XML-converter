// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      if (!Thread.interrupted()) {
        System.out.println(Thread.interrupted());
      } else {
        while (true) {
          if (!Thread.interrupted()) {
            System.out.println(Thread.interrupted());
            break;
          }
        }
      }
    });
    thread.start();
    thread.interrupt();
  }
}
