import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int result = 0;
    int current = 0;
    while (true) {
      result++;

      current += a;
      if (current >= h) {
        break;
      }

      current = current - b;
    }

    System.out.println(result);
  }
}