import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> knownWords = new ArrayList<>();
    List<String> words = new ArrayList<>();

    int count = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < count; i++){
      knownWords.add(scanner.nextLine());
    }

    count = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < count; i++){
      words.add(scanner.nextLine());
    }

    final List<String> finder = knownWords.stream().map(a -> a.toLowerCase()).collect(Collectors.toList());

    words.stream()
            .map(a -> a.toLowerCase())
            .flatMap(a -> Arrays.stream(a.split(" ")))
            .distinct()
            .forEach(a -> {
              if (!finder.contains(a)){
                System.out.println(a);
              }
            });
  }
}