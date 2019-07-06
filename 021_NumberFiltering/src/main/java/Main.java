import java.util.List;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    IntStream even = IntStream.iterate(1, operand -> operand += 2).limit(100);
    IntStream odd = IntStream.iterate(2, operand -> operand += 2).limit(100);

    IntStream result = createFilteringStream(even, odd);
  }

  public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
    return IntStream.concat(evenStream, oddStream).filter(a -> (a%3 == 0 && a%5 == 0)).sorted().skip(2);
  }
}
