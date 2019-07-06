import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {
  public static void main(String[] args) {
    System.out.println(sumOperator.applyAsInt(1, 4));
    System.out.println(productOperator.applyAsInt(1, 4));
    System.out.println(sumOperator.applyAsInt(5, 6));
    System.out.println(productOperator.applyAsInt(5, 6));
  }

  /**
   * The operator combines all values in the given range into one value
   * using combiner and initial value (seed)
   */
  public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator = (seed, op) -> (left, right) ->
  {
    int sum = seed;
    for (int x = left; x <= right; x++) {
      sum = op.applyAsInt(sum, x);
    }

    return sum;
  };

  /**
   * The operator calculates the sum in the given range (inclusively)
   */
  public static final IntBinaryOperator sumOperator  = reduceIntOperator.apply(0, (x,y) -> x + y);

  /**
   * The operator calculates the product in the given range (inclusively)
   */
  public static final IntBinaryOperator productOperator = reduceIntOperator.apply(1, (x,y) -> x * y);
}
