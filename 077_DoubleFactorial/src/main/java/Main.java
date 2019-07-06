import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(calcDoubleFactorial(scanner.nextInt()));
  }

  public static BigInteger calcDoubleFactorial(int n) {
    if (n == 0) {
      return BigInteger.ONE;
    } else {
      BigInteger sum = Stream.iterate(n, a -> a - 2)
              .limit(n / 2 + 2)
              .filter(a -> a > 0)
              .map(a -> BigInteger.valueOf((long) a))
              .reduce((a, b) -> a.multiply(b)).orElse(BigInteger.ZERO);

      return sum;
    }
  }
}


