import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringBuilder sb = new StringBuilder("You have chosen a ");
    switch (scanner.nextInt()) {
      case 1:
        sb.append("square");
        break;

      case 2:
        sb.append("circle");
        break;

      case 3:
        sb.append("triangle");
        break;

      case 4:
        sb.append("rhombus");
        break;

        default:
        sb = new StringBuilder("There is no such shape!");
    }

    System.out.println(sb);
  }
}