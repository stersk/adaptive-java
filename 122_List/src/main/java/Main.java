import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    List<Integer> list = Arrays.asList(scanner.nextLine().split(" "))
            .stream()
            .map(a -> Integer.parseInt(a))
            .collect(Collectors.toList());

    for (int i = 0; i < list.size(); i++) {
      if (i%2 != 0) {
        System.out.println(list.get(i));
      }

      if (list.get(i)%2 == 0){
        sum += list.get(i);
      }
    }

    System.out.println(sum);
  }
}