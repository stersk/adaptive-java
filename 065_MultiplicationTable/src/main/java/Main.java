import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    StringBuilder sb = new StringBuilder();
    for (int i = c; i <= d; i++) {
      sb.append('\t').append(i);
    }
    System.out.println(sb);


    for (int j = a; j <= b; j++){
      sb.setLength(0);
      sb.append(j);

      for (int i = c; i <= d; i++) {
        sb.append('\t').append(i * j);
      }

      System.out.println(sb);
    }
  }
}