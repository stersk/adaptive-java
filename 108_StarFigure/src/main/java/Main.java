import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    char[][] rectangle = new char[count][count];

    for (char[] row: rectangle) {
      Arrays.fill(row, '.');
    }

    int middle = count / 2;
    for (int i = 0; i < rectangle.length; i++) {
      for (int j = 0; j < rectangle[i].length; j++) {
        if (i == middle || j == middle || i == j || i == rectangle[i].length - 1 - j) {
          rectangle[i][j] = '*';
        }
      }
    }

    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < rectangle.length; i++) {
      stringBuilder.setLength(0);

      for (int j = 0; j < rectangle[i].length; j++) {
        stringBuilder.append(rectangle[i][j]).append(" ");
      }

      System.out.println(stringBuilder);
    }
  }
}