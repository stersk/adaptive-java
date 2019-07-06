import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int seconds = scanner.nextInt();

    LocalTime time = LocalTime.ofSecondOfDay(seconds % 86400);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
    System.out.println(time.format(formatter));
  }
}
