import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list;

    String read = reader.readLine();

    list = Stream.of(read.split(" ")).filter(a -> a.startsWith("J")).map(b -> b.substring(1)).collect(Collectors.toList());
    Collections.reverse(list);
    list.stream().forEach(c -> System.out.println(c));
  }
}
