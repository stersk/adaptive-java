import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  static int inX = 0;
  static int inY = 0;
  static int[][] input;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    inX  = Integer.valueOf(st.nextToken());
    inY  = Integer.valueOf(st.nextToken());
    int summ = 0;
    int maxSumm = -1000000;

    input = new int[inX][inY];

    for (int i = 0; i < inX; i++){
      String line = scanner.nextLine();

      st = new StringTokenizer(line);
      for (int j = 0; j < inY; j++) {
        summ = Integer.valueOf(st.nextToken());
        input[i][j] = summ;
      }
    }

    for (int i1 = 0; i1 < inX; i1++ ){
      for (int i2 = inX - 1; i2 >= i1; i2--){
        for (int j1 = 0; j1 < inY; j1++ ) {
          for (int j2 = inY - 1; j2 >= j1; j2--) {
            summ = getMatrixSumm(i1, i2, j1, j2);
            if (summ > maxSumm) {
              maxSumm = summ;
            }
          }
        }
      }
    }

    System.out.println(maxSumm);
  }

  static int getMatrixSumm(int i1, int i2, int j1, int j2){
    int result = 0;
    for (int i = i1; i <= i2; i++) {
      for (int j = j1; j <= j2; j++) {
        result += input[i][j];
      }
    }

    return result;
  }
}
