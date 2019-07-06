import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String type = scanner.nextLine();
    double result = 0.0;

    if (type.equals("rectangle")) {
      result = scanner.nextInt() * scanner.nextInt();

    } else if (type.equals("circle")) {
      int radius = scanner.nextInt();
      result = 3.14 * radius * radius;

    } else if (type.equals("triangle")) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      result = Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c))/4;
    }

    System.out.println(result);
  }
}