import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    int[] array = new int[numbers];
    for (int i = 0; i < numbers; i++){
      array[i] = scanner.nextInt();
    }

    int result = Arrays.stream(array).filter(a -> a%6 == 0).sum();
    System.out.println(result);
  }
}