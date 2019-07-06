import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.LongStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(scanner.nextLine());

    long start = Long.decode(st.nextToken());
    long finish = Long.decode(st.nextToken());

    long sum = LongStream.range(start, finish + 1).map(i -> (i%2 == 0)?0:i).sum();
    System.out.println(sum);
  }
}

