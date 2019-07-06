import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
   /*   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      reader.lines()
              .flatMap(a -> Stream.of(a.split(" ")))
              .mapToLong(Long::parseLong)
              .filter(lon -> lon% 2!= 0)
              .sorted()
              .forEach(result -> System.out.println(result));
*/


/*   ArrayList<Integer> list = (ArrayList<Integer>) Stream.of(2,0,1,7).collect(Collectors.toList());
   System.out.println(list);*/

      final long a1 = 5;
      final long a2 = 15;

      long result = LongStream.rangeClosed(a1,a2).reduce((b1,b2) -> b1 * b2).orElse(0);
      System.out.println(result);
    }


}
