import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();

    Stream.of(string.split(" "))
            .map(a -> a.toLowerCase())
            .collect(Collectors.groupingBy(a -> a.toString(), Collectors.counting()))
            .forEach((K,V) -> System.out.println(K + " " + V.toString()));
  }
}