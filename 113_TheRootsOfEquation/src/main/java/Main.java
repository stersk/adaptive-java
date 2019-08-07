import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    Stream.iterate(1, i -> i + 1).limit(1000).filter(x -> a*x*x*x + b*x*x + c*x + d == 0).sorted().forEach(root -> System.out.println(root));
  }
}