import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList();
    list1.add(1);
    list1.add(1);
    list1.add(1);
    list1.add(1);

    List<Integer> list2 = new ArrayList();
    list2.add(1);
    list2.add(2);
    list2.add(3);


    //operator1.add(this::squareAndThenGetNextEvenNumberTransformation);
  }

  /**
   * The function accepts a list of mappers and returns an operator that accepts a list of integers
   * and sequentially applies each mapper to each value (perform a transformation)
   */

  // Це вроді зробив

  public static final Function<List<IntUnaryOperator>, UnaryOperator<List<Integer>>> multifunctionalMapper = intUnaryOperators -> integers -> {
    List<Integer> resList = new ArrayList<>();
    for(int i : integers){
      for(IntUnaryOperator operator : intUnaryOperators){
        i = operator.applyAsInt(i);
      }
      resList.add(i);
    }
    return resList;
  };

  /**
   * EXAMPLE: the operator transforms each number to the same number (perform the identity transformation)
   *
   * It returns a list of the same numbers.
   */
  public static final UnaryOperator<List<Integer>> identityTransformation =
          multifunctionalMapper.apply(Arrays.asList(x -> x, x -> x, x -> x));

  /**
   * The operator accepts an integer list.
   * It multiplies by two each integer number and then add one to its.
   *
   * The operator returns transformed integer list.
   */
  public static final UnaryOperator<List<Integer>> multTwoAndThenAddOneTransformation =
          multifunctionalMapper.apply(Arrays.asList(x -> x * 2, x -> x + 1));
  /**
   * The operator accepts an integer list.
   * It squares each integer number and then get the next even number following it.
   *
   * The operator returns transformed integer list.
   */
  public static final UnaryOperator<List<Integer>> squareAndThenGetNextEvenNumberTransformation =
          multifunctionalMapper.apply(Arrays.asList(x -> x * x, x -> x + 2 - (x % 2)));
}
