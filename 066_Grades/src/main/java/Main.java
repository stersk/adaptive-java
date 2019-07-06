import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    int[] result = new int[4];

    for (int i = 1; i <= count; i++) {
      result[scanner.nextInt() - 2]++;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i<= 3; i++){
      sb.append(result[i]).append(' ');
    }

    System.out.println(sb);
  }
}