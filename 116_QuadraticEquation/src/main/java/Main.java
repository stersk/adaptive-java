import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d == 0) {
            double x = - b / 2 / a;
            System.out.printf(String.valueOf(x));
        } else if (d > 0) {
            double x1 = (- b + Math.sqrt(d)) / 2 / a;
            double x2 = (- b - Math.sqrt(d)) / 2 / a;

            if (x1 < x2) {
                System.out.printf(Double.toString(x1) + " " + Double.toString(x2));
            } else {
                System.out.printf(Double.toString(x2) + " " + Double.toString(x1));
            }
        }
    }
}
