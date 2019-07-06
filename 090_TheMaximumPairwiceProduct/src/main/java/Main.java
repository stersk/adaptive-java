import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    String digits = scanner.nextLine();

    long result = Arrays.stream(digits.trim().split(" "))
            .mapToLong(a -> Long.parseLong(a))
            .sorted()
            .limit(n)
            .skip(n - 2)
            .reduce((s1,s2) -> s1*s2).orElse(0);
    System.out.println(result);
  }
}