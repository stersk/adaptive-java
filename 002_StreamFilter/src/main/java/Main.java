import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] strings = reader.readLine().split(" ");
    List<Integer> helpList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    Stream.concat(list.stream(), Arrays.stream(strings).map(n -> Integer.valueOf(n))).collect(Collectors.toList());

    Set<Integer> set = helpList.stream().collect(Collectors.toSet());

    set = removeAllNumbersMoreThan10(set);
    set.forEach(System.out::println);
  }

  public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
    return set.stream().filter( n -> n <= 10).collect(Collectors.toSet());
  }
}
