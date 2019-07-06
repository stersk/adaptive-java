import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    List<Integer> list = new ArrayList<>();

    for (int i = 1; number > 0; i++) {
      if (number - i > i) {
        list.add(i);
        number -= i;
      } else {
        list.add(number);
        number = 0;
      }
    }


    int[] result = list.stream().mapToInt( i -> i.intValue()).toArray();


    System.out.println(result.length);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < result.length; i++) {
      sb.append(result[i]).append(" ");
    }

    System.out.println(sb.toString());
  }
}
