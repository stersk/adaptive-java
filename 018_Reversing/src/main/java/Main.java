import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    String inn = String.valueOf(input);
    StringBuilder sb = new StringBuilder();
    sb.append(inn.charAt(2));
    sb.append(inn.charAt(1));
    sb.append(inn.charAt(0));
    System.out.println(sb.toString());
  }
}
