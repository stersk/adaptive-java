import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i * m == k) {
        System.out.println("YES");
        return;
      }
    }

    for (int i = 1; i <= m; i++) {
      if (i * n == k) {
        System.out.println("YES");
        return;
      }
    }

    System.out.println("NO");
  }
}