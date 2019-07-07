import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[][] matrix = new int[size][size];

    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = Math.abs(i - j);
      }

      stringBuilder.setLength(0);
      for (int j = 0; j < matrix[i].length; j++) {
        stringBuilder.append(matrix[i][j]).append(" ");
      }

      System.out.println(stringBuilder);
    }
  }
}
