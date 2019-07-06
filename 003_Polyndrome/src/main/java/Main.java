import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String test = scanner.nextLine();
    System.out.println(test.equals(new StringBuilder(test).reverse().toString())?"true":"false");

    int length = 0;
    int value;
    while (scanner.hasNextInt()) {
      value = scanner.nextInt();
      if (value == 0) {
        System.out.println(length);
      } else {
        length++;
      }
    }

  }
}