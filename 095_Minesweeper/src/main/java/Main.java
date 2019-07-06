import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[][] mines = new char[scanner.nextInt()][scanner.nextInt()];

    scanner.nextLine();
    for (int n = 0; n < mines.length; n++){
      String line = scanner.nextLine();
      mines[n] = line.toCharArray();
    }

    for (int n = 0; n < mines.length; n++) {
      for (int m = 0; m < mines[n].length; m++) {

        if (mines[n][m] == '*') {
          continue;
        }

        int count = 0;

        for (int n1 = n - 1; n1 <= n + 1; n1++) {
          if (n1 < 0 || n1 >= mines.length) {
            continue;
          }

          for (int m1 = m - 1; m1 <= m + 1; m1++) {
            if (m1 < 0 || m1 >= mines[n].length) {
              continue;
            }

            if (mines[n1][m1] == '*') {
              count++;
            }
          }
        }

        mines[n][m] = Character.forDigit(count,10);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int n = 0; n < mines.length; n++) {
      sb.setLength(0);
      for (int m = 0; m < mines[n].length; m++) {
        sb.append(mines[n][m]).append(" ");
      }

      System.out.println(sb);
    }
  }
}