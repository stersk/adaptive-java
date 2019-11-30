import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = Math.min(a, b);
        int y = Math.max(a, b);
        for (int i = 1; i<=x; i++) {
            if ((y * i)%x == 0) {
                System.out.println(y*i);
                break;
            }
        }
    }
}
