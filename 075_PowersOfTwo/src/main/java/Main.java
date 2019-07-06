import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();

    Stream.iterate(0, a -> a + 1)
            .limit(50)
            .map(a -> Integer.valueOf((int) Math.pow(2d, (double) a.intValue())))
            .filter(a -> a <= limit)
            .forEach(a -> System.out.println(a));
  }
}