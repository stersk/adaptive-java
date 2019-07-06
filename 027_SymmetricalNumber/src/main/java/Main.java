import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String numS = String.valueOf(num);
    while (numS.length() < 4) {
      numS = "0" + numS;
    }

    int result = 12;
    if (new StringBuilder(numS).reverse().toString().equals(numS)) {
      result = 1;
    }

    System.out.println(result);
  }
}
