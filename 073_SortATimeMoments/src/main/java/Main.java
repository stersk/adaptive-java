import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    scanner.nextLine();
    TimeMoment[] moments = new TimeMoment[count];

    for (int i = 0; i < count; i++) {
      StringTokenizer st = new StringTokenizer(scanner.nextLine());
      moments[i] = new TimeMoment(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
    }

    Arrays.sort(moments);

    for (int i = 0; i < moments.length; i++){
      System.out.println(moments[i].toString());
    }
  }
}