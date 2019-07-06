import java.util.Scanner;

class Main {
  public static void main(String[] args) throws RuntimeException {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[scanner.nextInt()];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    int[] searchingNumbers = new int[scanner.nextInt()];
    for (int i = 0; i < searchingNumbers.length; i++) {
      searchingNumbers[i] = scanner.nextInt();
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < searchingNumbers.length; i++) {
      stringBuilder.append(binarySearch(searchingNumbers[i], numbers)).append(" ");
    }

    System.out.println(stringBuilder);
  }

  private static int binarySearch(int numberForSearch, int[] numbers) {
    int i = 0;
    int j = numbers.length - 1;
    int result = -1;
    int testElement;

    while (numbers[i] != numberForSearch && numbers[j] != numberForSearch && i != j && j - i >= 2) {
      testElement = i + (j - i)/2;
      if (numbers[testElement] > numberForSearch) {
        j = testElement;
      } else {
        i = testElement;
      }
    }

    if (numbers[i] == numberForSearch) {
      result = i + 1;
    } else if (numbers[j] == numberForSearch) {
      result = j + 1;
    }

    return result;
  }
}