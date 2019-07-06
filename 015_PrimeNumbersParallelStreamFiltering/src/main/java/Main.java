import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long beginRange = scanner.nextLong();
    long endRange = scanner.nextLong();

    LongStream longStream = createPrimesFilteringStream(beginRange, endRange);
    System.out.println(longStream.count());
  }

  public static LongStream createPrimesFilteringStream(long rangeBegin, long rangeEnd) {
    return LongStream.rangeClosed(rangeBegin, rangeEnd).parallel().filter(a -> NumberUtils.isPrime(a));
  }

  public static boolean isPrime(final long number) {
    return (Stream.iterate(1, i -> i + 1).limit(number).filter(n -> number % n == 0).count() == 2);
  }
}

