import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word1 = scanner.nextLine();
    char[] letters1 = word1.toLowerCase().toCharArray();
    int part1 = 0;
    int part2 = 0;

    for (int i = 0; i < 6; i++) {
      if (i < 3) {
        part1 += Integer.parseInt(String.valueOf(letters1[i]));
      } else {
        part2 += Integer.parseInt(String.valueOf(letters1[i]));
      }
    }

    System.out.println(part1 == part2 ? "Lucky" : "Regular");
  }
}