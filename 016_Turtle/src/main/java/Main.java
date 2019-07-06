import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    String line, direction;
    int distance;
    String[] inputData;


    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      scanner.useDelimiter("\\n");
      line = scanner.next();
      inputData = line.split("\\s+");
      direction = inputData[0];
      distance = Integer.parseInt(inputData[1]);

      if (direction.equalsIgnoreCase("North")) y += distance;
      else if (direction.equalsIgnoreCase("South")) y -= distance;
      else if (direction.equalsIgnoreCase("East")) x += distance;
      else if (direction.equalsIgnoreCase("West")) x -= distance;
    }

    StringBuilder builder = new StringBuilder();
    builder.append(x);
    builder.append(" ");
    builder.append(y);

    System.out.println(builder.toString());
  }
}
