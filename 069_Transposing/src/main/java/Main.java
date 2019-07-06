import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    int rows  = Integer.valueOf(st.nextToken());
    int columns  = Integer.valueOf(st.nextToken());

    int[][] matrix = new int[rows][columns];

    for (int i = 0; i < rows; i++){
      st = new StringTokenizer(scanner.nextLine());
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = Integer.valueOf(st.nextToken());
      }
    }

    matrix = transpose(matrix);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < matrix.length; i++) {
      sb.setLength(0);
      for (int j = 0; j < matrix[i].length; j++){
        sb.append(matrix[i][j]).append(" ");
      }

      System.out.println(sb);
    }
  }

  public static int[][] transpose(int[][] matrix){
    int[][] result = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        result[j][i] = matrix[i][j];
      }
    }

    return result;
  }
}