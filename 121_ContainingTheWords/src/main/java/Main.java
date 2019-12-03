import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Arrays.asList(scanner.nextLine().split(" "))
            .stream()
            .map(word -> word.length())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Long>comparingByKey())
            .forEach(entry -> System.out.println(entry.getKey().toString() + ": " + entry.getValue().toString()));

  }
}