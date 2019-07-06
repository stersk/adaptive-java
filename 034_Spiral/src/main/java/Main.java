import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int i, j = 0;
    int k = 1;

    int[][] matrix = new int[length][length];

    for (i = 0; i < length; i++){
      matrix[i][j] = k;
      k++;
    }
    i--;

    int lastIndex = 0;

    while (length > 1) {
      // справа вниз
      length--;
      lastIndex = j + length;
      for (j++; j <= lastIndex; j++){
        matrix[i][j] = k;
        k++;
      }
      j--;

      // снизу влево
      lastIndex = i - length;
      for (i--; i >= lastIndex; i--){
        matrix[i][j] = k;
        k++;
      }
      i++;

      //слева вверх
      length--;
      lastIndex = j - length;
      for (j--; j >= lastIndex; j--){
        matrix[i][j] = k;
        k++;
      }
      j++;

      //сверху вправо
      lastIndex = i + length;
      for (i++; i <= lastIndex; i++){
        matrix[i][j] = k;
        k++;
      }
      i--;
    }

    StringBuilder sb = new StringBuilder();
    for (i = 0; i < matrix.length; i++){
      sb.setLength(0);
      for (j = 0; j < matrix[i].length; j++){
        sb.append(matrix[j][i]).append(" ");
      }

      System.out.println(sb.toString());
    }
  }
}
