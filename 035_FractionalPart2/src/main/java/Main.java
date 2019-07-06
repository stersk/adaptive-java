import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double number = scanner.nextDouble();

    System.out.println((int) Math.floor((number - Math.floor(number)) * 10));
  }
}
