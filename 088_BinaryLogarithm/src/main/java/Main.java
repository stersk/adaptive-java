import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int[] numbers = new int[count];
    for (int i = 0; i < count; i++){
      numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < count; i++){
      System.out.println(log(numbers[i],2));
    }

  }

  static int log(int x, int base)
  {
    return (int) (Math.log(x) / Math.log(base));
  }
}