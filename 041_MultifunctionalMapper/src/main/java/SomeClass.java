import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class SomeClass {
  public List<IntUnaryOperator> getFirstOperator(){
    List<IntUnaryOperator> operator1 = new ArrayList<>();
    operator1.add(this::ide)

    return operator1;
  }

  /**
   * The function accepts a list of mappers and returns an operator that accepts a list of integers
   * and sequentially applies each mapper to each value (perform a transformation)
   */
  public static final Function<List<IntUnaryOperator>, UnaryOperator<List<Integer>>> multifunctionalMapper = a -> {
    IntUnaryOperator result = a.get(0);
    for (int i = 1; i < a.size(); i++){
      result.andThen(a.get(i));
    }

    UnaryOperator<List<Integer>> resultedUnaryOperator = new UnaryOperator<List<Integer>>() {
      @Override
      public List<Integer> apply(List<Integer> integers) {
        return integers.stream().map(a -> result.applyAsInt(a)).collect(Collectors.toList());
      }
    };

    return  resultedUnaryOperator;
  };

  /**
   * EXAMPLE: the operator transforms each number to the same number (perform the identity transformation)
   *
   * It returns a list of the same numbers.
   */
  public final UnaryOperator<List<Integer>> identityTransformation =
          multifunctionalMapper.apply(Arrays.asList(x -> x, x -> x, x -> x));

  /**
   * The operator accepts an integer list.
   * It multiplies by two each integer number and then add one to its.
   *
   * The operator returns transformed integer list.
   */
  public static final UnaryOperator<List<Integer>> multTwoAndThenAddOneTransformation = a -> a.stream()
          .map(b -> b * 2 + 1)
          .collect(Collectors.toList());

  /**
   * The operator accepts an integer list.
   * It squares each integer number and then get the next even number following it.
   *
   * The operator returns transformed integer list.
   */
  public static final UnaryOperator<List<Integer>> squareAndThenGetNextEvenNumberTransformation = a ->  a.stream()
          .map(b -> {b = (int) Math.pow(b, 2);
            if (b % 2 == 1) {
              b++;
            };
            return  b;})
          .collect(Collectors.toList());
}
