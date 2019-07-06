import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word1 = scanner.nextLine();
    String word2 = scanner.nextLine();
    char[] letters1 = word1.toLowerCase().toCharArray();
    char[] letters2 = word2.toLowerCase().toCharArray();
    Arrays.sort(letters1);
    Arrays.sort(letters2);

    if (letters1.length != letters2.length) {
      System.out.println("False");
      return;
    }

    for (int i = 0; i < letters1.length; i++){
      if (letters1[i] != letters2[i]) {
        System.out.println("False");
        return;
      }
    }

    System.out.println();
  }
}