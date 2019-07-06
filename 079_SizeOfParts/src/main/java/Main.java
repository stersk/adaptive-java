import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] result = new int[3];
    int parts = scanner.nextInt();
    for (int i = 0; i < parts; i++) {
      switch (scanner.nextInt()) {
        case -1:
          result[2]++;
          break;
        case 0:
          result[0]++;
          break;
        case 1:
          result[1]++;
          break;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(result[0]).append(" ").append(result[1]).append(" ").append(result[2]);
    System.out.println(sb);
  }
}