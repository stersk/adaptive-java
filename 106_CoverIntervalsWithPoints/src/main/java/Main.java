import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    List<Interval> intervals = new ArrayList<>();

    for (int i = 0; i < count; i++) {
      intervals.add(new Interval(scanner.nextInt(), scanner.nextInt()));
    }

    List<Integer> result = solve(intervals);

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < result.size(); i++) {
      stringBuilder.append(result.get(i)).append(" ");
    }

    System.out.println(result.size());
    System.out.println(stringBuilder);
  }

  private static List<Integer> solve(List<Interval> intervals) {
    Collections.sort(intervals);

    List<Integer> points = new ArrayList<>();
    List<Interval> intervaltToDelete = new ArrayList<>();

    while (!intervals.isEmpty()) {
      intervaltToDelete.clear();
      int point = intervals.get(0).getB();
      points.add(point);
      for (int i = 0; i < intervals.size(); i++) {
        Interval checkingInterval = intervals.get(i);
        if (checkingInterval.containPoint(point)){
          intervaltToDelete.add(checkingInterval);
        }
      }

      intervals.removeAll(intervaltToDelete);
    }

    Collections.sort(points);

    return points;
  }
}
