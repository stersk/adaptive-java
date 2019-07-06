import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosfen {
  public static int[] getPrimeNumbers(int n) {
    boolean[] primes = new boolean[n+1];
    fillSieve(primes);

    List<Integer> primesOnly = new ArrayList<>();
    for (int i = 0; i < primes.length; i++){
      if (primes[i]) {
        primesOnly.add(i);
      }
    }

    return primesOnly.stream().sorted().mapToInt(a -> a.intValue()).toArray();
  }

  private static void fillSieve(boolean[] primes) {
    Arrays.fill(primes, true);
    primes[0] = false;
    primes[1] = false;
    for (int i = 2; i < primes.length; ++i) {
      if (primes[i]) {
        for (int j = 2; i * j < primes.length; ++j) {
          primes[i * j] = false;
        }
      }
    }
  }
}
