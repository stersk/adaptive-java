import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    name = name.replaceAll("\\s{1,}", "_");
    System.out.println(name);
  }
}