import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int count = 0;

    int limit = scanner.nextInt();
    for (int i = 1; i <= limit; i++) {
      for (int j = 0; j < i; j++) {
        if (count >= limit) {
          break;
        }

        sb.append(i).append(" ");
        count++;
      }
    }

    System.out.println(sb);
  }
}
