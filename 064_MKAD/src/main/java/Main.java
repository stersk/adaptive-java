import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int speed = scanner.nextInt();
    int hounrs = scanner.nextInt();

    int startPoint = speed >= 0 ? 0 : 109;
    int finishPoint = startPoint + (speed * hounrs);

    if (finishPoint < 0) {
      finishPoint = 109 + finishPoint % 109;
    } else if (finishPoint > 109) {
      finishPoint = finishPoint % 109;
    }

    if (finishPoint == 109) {
      finishPoint = 0;
    }

    System.out.println(finishPoint);
  }
}