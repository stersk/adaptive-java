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

    String inputData = reader.readLine();

    List<String> list = Arrays.stream(inputData.split(" ")).filter(a -> a.startsWith("J")).map(a -> a.substring(1)).collect(Collectors.toList());
    ListIterator<String> listIterator = list.listIterator();
    while (listIterator.hasNext()) listIterator.next();
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
    }
  }
}
