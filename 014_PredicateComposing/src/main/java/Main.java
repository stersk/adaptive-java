import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Main {
  public static void main(String[] args) {
    IntPredicate predicate = new IntPredicate() {
      public boolean test(int value) {
        return false;
      }
    };

    List<IntPredicate> list = new ArrayList<>();
    list.add(predicate);
    IntPredicate result = disjunctAll(list);
  }

  /**
   * The method represents a disjunct operator for a list of predicates.
   * For an empty list it returns the always false predicate.
   */
  public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
    IntPredicate result = predicates.stream().reduce((s1,s2) -> s1.or(s2)).get();
  }
}
