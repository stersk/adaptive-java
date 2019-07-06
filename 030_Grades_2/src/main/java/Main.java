import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      String line = scanner.nextLine();

      int students = (int) Stream.of(line)
              .flatMap(a -> Stream.of(a.split(" ")))
              .filter(lon -> lon.equals("A"))
              .count();

      int allStudents = (int) Stream.of(line)
              .flatMap(a -> Stream.of(a.split(" ")))
              .count();

      System.out.println((double) students / allStudents);
    }
}
