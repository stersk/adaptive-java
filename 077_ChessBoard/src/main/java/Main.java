import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] coords = scanner.nextLine().split(" ");
    int r1 = Math.abs(Integer.parseInt(coords[0]) - Integer.parseInt(coords[2]));
    int r2 = Math.abs(Integer.parseInt(coords[1]) - Integer.parseInt(coords[3]));
    if (r1 == 0 || r2 == 0 || r1 == r2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}