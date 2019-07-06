
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] data = scanner.nextLine().split("/");
    StringBuilder sb = new StringBuilder();

    int up = Integer.parseInt(data[0]);
    int down = Integer.parseInt(data[1]);


    while (up%down != 0) {
      int coeff = (int) Math.floor(up / down);

      sb.append(coeff).append(" ");
      up = up - coeff * down;

      coeff = up;
      up = down;
      down = coeff;
    }

    sb.append(up/down);

    System.out.println(sb);
  }
}