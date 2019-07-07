import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String testString = scanner.nextLine();

    if (Pattern.matches("19\\d{9}", testString)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
