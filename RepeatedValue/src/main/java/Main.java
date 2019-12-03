import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     List<String> result = Arrays.asList(scanner.nextLine().split(" "))
             .stream()
             .map(a -> Integer.parseInt(a))
             .sorted()
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
             .entrySet()
             .stream()
             .filter(entry -> entry.getValue() > 1)
             .map(entry1 -> entry1.getKey())
             .map(x -> x.toString())
             .collect(Collectors.toList());
    System.out.println(String.join(" ", result));
  }
}