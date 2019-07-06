import java.util.*;

public class Main {
  private static class TeamStats {
    public int games = 0;
    public int defeats = 0;
    public int wins = 0;
    public int draws = 0;
    public int points = 0;
  }

  public static void main(String[] args) {
    String line;
    int firstGoals, secondGoals, firstPoints, secondPoints;
    String[] playData;
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    Map<String, TeamStats> table = new HashMap<>();

    scanner.useDelimiter("\n");

    for (int i = 0; i < count; i++) {
      line = scanner.next();
      playData = line.split(";");
      firstGoals = Integer.parseInt(playData[1]);
      secondGoals = Integer.parseInt(playData[3]);

      TeamStats statsFirst = new Main.TeamStats();
      TeamStats statsSecond = new Main.TeamStats();
      if (firstGoals > secondGoals) {
        statsFirst.points += 3;
        statsFirst.games++;
        statsFirst.wins++;

        statsSecond.games++;
        statsSecond.defeats++;

      } else if (secondGoals > firstGoals) {
        statsSecond.points += 3;
        statsSecond.games++;
        statsSecond.wins++;

        statsFirst.games++;
        statsFirst.defeats++;
      } else {
        statsFirst.points++;
        statsSecond.points++;

        statsFirst.draws++;
        statsSecond.draws++;

        statsFirst.games++;
        statsSecond.games++;
      };


      table.merge(playData[0], statsFirst, (a1,a2) -> {
        a1.games += a2.games;
        a1.wins += a2.wins;
        a1.draws += a2.draws;
        a1.defeats += a2.defeats;
        a1.points += a2.points;
        return a1;});

      table.merge(playData[2], statsSecond, (a1,a2) -> {
        a1.games += a2.games;
        a1.wins += a2.wins;
        a1.draws += a2.draws;
        a1.defeats += a2.defeats;
        a1.points += a2.points;
        return a1;});
    }


    table.forEach((a1, a2) -> {
      StringBuilder sb = new StringBuilder(a1);
      sb.append(":").append(a2.games).append(" ").append(a2.wins).append(" ").append(a2.draws).append(" ").append(a2.defeats).append(" ").append(a2.points);

      System.out.println(sb.toString());
    });

  }
}
