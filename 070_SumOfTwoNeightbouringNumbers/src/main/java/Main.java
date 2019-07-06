import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(scanner.nextLine());

    int[] numbers = new int[st.countTokens() + 2];
    for (int i = 1; st.hasMoreTokens(); i++){
      numbers[i] = Integer.parseInt(st.nextToken());
    }

    if (numbers.length != 3) {
      numbers[0] = numbers[numbers.length - 2];
      numbers[numbers.length - 1] = numbers[1];

      StringBuilder sb = new StringBuilder();
      for (int i = 1; i < numbers.length - 1; i++){
        sb.append(numbers[i - 1] + numbers [i + 1]).append(" ");
      }

      System.out.println(sb);
    } else {
      System.out.println(numbers[1]);
    }


  }
}