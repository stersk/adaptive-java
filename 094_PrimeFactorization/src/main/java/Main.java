import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int[] primeNumbers = Eratosfen.getPrimeNumbers(number);

    List<Integer> resultElements = new ArrayList<>();
    while (number > 1) {
      for (int i = 0; i < primeNumbers.length; i++){
        if (number < primeNumbers[i]) {
          continue;
        }

        if (number % primeNumbers[i] == 0) {
          resultElements.add(primeNumbers[i]);
          number = number / primeNumbers[i];

          break;
        }
      }
    }

    String resultString = resultElements.stream().map(a -> Integer.toString(a)).collect(Collectors.joining(" "));
    System.out.println(resultString);
  }
}
