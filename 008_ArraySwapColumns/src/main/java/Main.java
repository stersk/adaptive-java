import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    int inX  = Integer.valueOf(st.nextToken());
    int inY  = Integer.valueOf(st.nextToken());
    int indiceX = 0;
    int indiceY = 0;

    int[][] input = new int[inX][inY];

    for (int i = 0; i < inX; i++){
      st = new StringTokenizer(scanner.nextLine());
      for (int j = 0; j < inY; j++) {
        input[i][j] = Integer.valueOf(st.nextToken());
      }
    }

    st = new StringTokenizer(scanner.nextLine());
    indiceX  = Integer.valueOf(st.nextToken());
    indiceY  = Integer.valueOf(st.nextToken());

    for (int i = 0; i < inX; i++){
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < inY; j++) {
        if (j == indiceX) {
          sb.append(input[i][indiceY]);
        } else if (j == indiceY) {
          sb.append(input[i][indiceX]);
        } else {
          sb.append(input[i][j]);
        }

        sb.append(" ");
      }
      //sb.deleteCharAt(sb.length() - 1);
      System.out.println(sb.toString());
    };
  }
}