import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();

    String line = scanner.nextLine();
    long numbers = Arrays.stream(line.split(" ")).mapToInt(a -> Integer.parseInt(a)).distinct().count();
    System.out.println(numbers);
  }
}
