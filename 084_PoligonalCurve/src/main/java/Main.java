import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Point> points = new ArrayList<>();
    int pointsCount = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < pointsCount; i++) {
      points.add(new Point(scanner.nextInt(), scanner.nextInt()));
    }

    points.stream().sorted().forEach(a -> {
      StringBuilder sb = new StringBuilder();
      System.out.println(sb.append(a.getX()).append(" ").append(a.getY()).toString());
    });
  }
}
