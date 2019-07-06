import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int squirels = scanner.nextInt();
    int nuts = scanner.nextInt();

    System.out.println(nuts % squirels);
  }
}
