import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.nextLine();

    String array = scanner.nextLine();
    System.out.println(Arrays.stream(array.split(" ")).mapToInt(a -> Integer.parseInt(a)).filter(a -> a == number).count());
  }
}