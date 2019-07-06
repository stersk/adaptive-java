import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    char[] chars = scanner.nextLine().toCharArray();
    StringBuilder sb = new StringBuilder();

    char currentChar = chars[0];
    int currentCount = 0;
    for (int i = 1; i < chars.length; i++) {
      if (currentChar == chars[i]){
        currentCount++;
      } else {
        sb.append(currentChar);
        if (currentCount > 0) {
          sb.append(currentCount + 1);
        }

        currentChar = chars[i];
        currentCount = 0;
      }
    }

    sb.append(currentChar);
    if (currentCount > 0) {
      sb.append(currentCount + 1);
    }

    System.out.println(sb);
  }
}
