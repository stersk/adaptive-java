import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    int[] array = new int[100];
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();

    for (int i = 0; i <= m; i++){
      array[i] = 0;
    }

    List<String> list = new ArrayList<>();

    decompose(m,m,0,array, list);

    Collections.reverse(list);
    list.stream().forEach(a -> System.out.println(a));
  }

  private static void decompose(int n, int k, int i, int[] array, List<String> result){
    if (n < 0) {
      return;
    }

    if (n == 0) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < i; j++){
        sb.append(array[j]).append(" ");
      }

      result.add(sb.toString());
    } else {
      if (n - k >= 0) {
        array[i] = k;
        decompose(n - k, k, i + 1, array, result);
      }

      if (k - 1 > 0) {
        decompose(n, k - 1, i, array, result);
      }
    }
  }
}
