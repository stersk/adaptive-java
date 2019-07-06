import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    set1.addAll(Stream.of(3, 14, 16, 5, 13, 2, 20, 10, 6, 9).collect(Collectors.toList()));
    set2.addAll(Stream.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20).collect(Collectors.toList()));

    Set<Integer> set3 = symDifference(set1, set2);
    System.out.println(set3.toString());
  }

  public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
    Stream<Integer> stream1 = set1.stream().filter(i -> !set2.contains(i));
    Stream<Integer> stream2 = set2.stream().filter(i -> !set1.contains(i));

    return Stream.concat(stream1, stream2).collect(Collectors.toSet());
  }
}
