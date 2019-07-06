import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] letters = scanner.nextLine().toLowerCase().toCharArray();
    int count = 0;
    for (int i = 0; i < letters.length; i++) {
      if (letters[i] == 'g' || letters[i] == 'c') {
        count++;
      }
    }

    System.out.println((double) count * 100/ letters.length);
  }
}