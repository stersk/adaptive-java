import java.util.stream.Stream;

public class NumberUtils {
  public static boolean isPrime(long number) {
    return (Stream.iterate(1, i -> i + 1).limit(number).filter(n -> number % n == 0).count() == 2);
  }
}
