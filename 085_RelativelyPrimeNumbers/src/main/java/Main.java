import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(phi(scanner.nextInt()));
  }

  public static int phi(int n) {
    int result = n;
    for (int i=2; i*i<=n; ++i)
      if (n % i == 0) {
        while (n % i == 0)
          n /= i;
        result -= result / i;
      }
    if (n > 1)
      result -= result / n;
    return result;
  }
}