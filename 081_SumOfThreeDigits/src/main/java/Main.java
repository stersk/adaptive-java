import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] chars = scanner.nextLine().toCharArray();
    int sum = 0;
    for (int i = 0; i < chars.length; i++) {
      sum += Integer.valueOf(String.valueOf(chars[i]));
    }

    System.out.println(sum);
  }
}