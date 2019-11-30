import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> units = new HashMap<>();
        units.put("mile", 1609d);
        units.put("yard", 0.9144d);
        units.put("foot", 0.3048d);
        units.put("inch", 0.0254d);
        units.put("km", 1000d);
        units.put("m", 1d);
        units.put("cm", 0.01d);
        units.put("mm", 0.001d);

        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");

        double result = Double.parseDouble(data[0]);
        result *= units.get(data[1]);
        result /= units.get(data[3]);

        System.out.printf("'%5.2e'%n", result);
    }
}
