import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Main {
  public static void main(String[] args) {
    List<Double> list = new ArrayList<>();
    list.add(4d);
    list.add(4d);
    list.add(4d);
    list.add(100d);
    list.add(100d);
    list.add(100d);

    List<Double> list2 = spliteratorWork(list);
    print(list2);
  }

  public static List<Double> spliteratorWork(List<Double> lst){
    List<Double> sqrs = new ArrayList<>();
    Spliterator spliterator = lst.spliterator();
    spliterator.forEachRemaining(a -> {
      double value = (Double) a;
      if (value > 1d) {
        sqrs.add(Math.sqrt(value));
      }
    });

    return sqrs;
  }
  public static void print(List<Double> list){
    Spliterator<Double> firstSpliterator = list.spliterator();
    Spliterator<Double> secondSpliterator = firstSpliterator.trySplit();

    secondSpliterator.forEachRemaining(a -> {
      double value = (Double) a;
      if (value >= 2d) {
        System.out.println(value);
      }
    });

    System.out.println("");

    firstSpliterator.forEachRemaining(a -> {
        double value = (Double) a;
        if (value >= 10d) {
          System.out.println(value);
        }
    });
  }
}
