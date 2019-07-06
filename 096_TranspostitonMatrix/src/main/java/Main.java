import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows  = scanner.nextInt();
    int columns  = scanner.nextInt();

    int[][] matrix = new int[rows][columns];

    for (int i = 0; i < rows; i++){
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    matrix = transpose(matrix);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < columns; i++){
      for (int j = 0; j < rows; j++) {
        sb.append(matrix[i][j]).append(' ');
      }
    }

    System.out.println(sb);
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