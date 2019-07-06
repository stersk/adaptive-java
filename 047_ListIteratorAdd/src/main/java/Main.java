import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());

    ListIterator iterator = list.listIterator();
    String word;
    while (iterator.hasNext()) {
      word = (String) iterator.next();

      if (word.equals("Hip")) {
        iterator.add("Hop");
      }
    }

    iterator = list.listIterator();
    while (iterator.hasNext()) {
      System.out.println((String) iterator.next());
    }
  }
}
