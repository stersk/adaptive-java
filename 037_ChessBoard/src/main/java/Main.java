import java.util.Collections;
import java.util.Scanner;
        import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] coords = new int[4];
    boolean hits = false;

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    for (int j = 0; j < coords.length; j++) {
      coords[j] = Integer.valueOf(st.nextToken());
    }

    if (coords[0] == coords[2] || coords[1] == coords[3]) {
      hits = true;
    } else if (Math.abs(coords[0] - coords[2]) == Math.abs(coords[1] - coords[3])) {
      hits = true;
    }

    System.out.println(hits ? "YES":"NO");
  }
}
