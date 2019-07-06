import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringTokenizer st = new StringTokenizer(scanner.nextLine());
    int rows  = Integer.valueOf(st.nextToken());
    int seats  = Integer.valueOf(st.nextToken());

    int[][] cinemaSeats = new int[rows][seats];

    for (int i = 0; i < rows; i++){
      st = new StringTokenizer(scanner.nextLine());
      for (int j = 0; j < seats; j++) {
        cinemaSeats[i][j] = Integer.valueOf(st.nextToken());
      }
    }

    int seatsNeeded      = scanner.nextInt();

/*    int rows  = 5;
    int seats = 5;
    int seatsNeeded      = 3;
    int[][] cinemaSeats = {
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0},
            {1, 0, 0, 0, 1},
            {1, 1, 0, 0, 0}};*/

/*    int rows  = 3;
    int seats = 4;
    int seatsNeeded      = 2;
    int[][] cinemaSeats = {
            {0, 1, 0, 1},
            {1, 0, 0, 1},
            {1, 1, 1, 1}};*/

    int result = 0;
    int consecutiveSeats = 0;
    int currentSeats, index;
    int[][] allConsecutiveSeats = new int[rows][seats];
    boolean seatsStarted = false;

    for (int i = 0; i < rows; i++) {
      currentSeats = 0;
      index = 0;

      for (int j = 0; j < seats; j++) {
        if (cinemaSeats[i][j] == 0) {
          seatsStarted = true;
          currentSeats++;
        } else if (seatsStarted) {
          allConsecutiveSeats[i][index] = currentSeats;

          seatsStarted = false;
          currentSeats = 0;
          index++;
        }
      }

      if (seatsStarted) {
        allConsecutiveSeats[i][index] = currentSeats;
        seatsStarted = false;
      }
    }

    int currentMin = 0;
    for (int i = 0; i < allConsecutiveSeats.length; i++) {
      consecutiveSeats = 0;
      for (int j = 0; j < seats; j++) {
        if (allConsecutiveSeats[i][j] == seatsNeeded) {
          consecutiveSeats = consecutiveSeats > 0 ? Math.min(allConsecutiveSeats[i][j], consecutiveSeats) : allConsecutiveSeats[i][j];
        }
      }

      if (consecutiveSeats == seatsNeeded) {
        result = i + 1;
        break;
      } else if (consecutiveSeats != 0 && (currentMin == 0 || currentMin > consecutiveSeats)) {
        currentMin = consecutiveSeats;
        result = i + 1;

      }
    }

    System.out.println(result);
  }
}
