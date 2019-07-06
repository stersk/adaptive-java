import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] input = scanner.nextLine().toCharArray();

    int count = 1;
    char character = input[0];
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length - 1; i++) {
      if (character != input[i + 1]) {
        sb.append(character).append(count);
        count = 1;
        character = input[i + 1];
      } else {
        count++;
      }
    }

    sb.append(character).append(count);

    System.out.println(sb);
  }
}