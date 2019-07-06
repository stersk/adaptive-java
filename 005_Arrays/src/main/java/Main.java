import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    int inX  = Integer.valueOf(st.nextToken());
    int inY  = Integer.valueOf(st.nextToken());

    int[][] input = new int[inX][inY];

    for (int i = 0; i < inX; i++){
      st = new StringTokenizer(scanner.nextLine());
      for (int j = 0; j < inY; j++) {
        input[i][j] = Integer.valueOf(st.nextToken());
      }
    }

    for (int j = 0; j < inY; j++){
      StringBuilder sb = new StringBuilder();
      for (int i = inX - 1; i > -1; i--) {
        sb.append(input[i][j]);
        sb.append(" ");
      }
      //sb.deleteCharAt(sb.length() - 1);
      System.out.println(sb.toString());
    };
  }
}
