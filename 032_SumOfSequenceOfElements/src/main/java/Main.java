import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int scannedData = 0;
    int summ = 0;
    scannedData = scanner.nextInt();

    while (scannedData != 0) {
      summ += scannedData;
      scannedData = scanner.nextInt();
    }

    System.out.println(summ);
  }
}
