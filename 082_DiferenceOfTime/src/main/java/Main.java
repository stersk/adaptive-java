import java.time.LocalTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    LocalTime firstTime = LocalTime.of(scanner.nextInt(),scanner.nextInt(), scanner.nextInt(), 0);
    LocalTime secondTime = LocalTime.of(scanner.nextInt(),scanner.nextInt(), scanner.nextInt(), 0);

    System.out.println(firstTime.until(secondTime, SECONDS));
  }
}