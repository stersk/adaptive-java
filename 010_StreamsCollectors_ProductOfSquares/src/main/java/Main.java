import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    long val = numbers.stream().collect(Collector.of(
            () -> new long[]{1},
            (result, value) -> result[0] *= value * value,
            (result1, result2) -> {
              result1[0] *= result2[0];
              return result1;
            },
            total -> total[0]
    ));
    System.out.println(val);
  }
}
