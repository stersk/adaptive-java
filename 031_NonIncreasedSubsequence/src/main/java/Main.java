package java;

import java.util.*;
import java.util.stream.Stream;

public class Main {
  static final int MAX_INT = -1;

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    scanner.useDelimiter("\n");
    String integers = scanner.next();

    //int[] numbers = IntStream.concat(IntStream.of(1),Stream.of(integers.split(" ")).mapToInt(b -> Integer.parseInt(b))).toArray();
    int[] numbers = Stream.of(integers.split(" ")).mapToInt(b -> Integer.parseInt(b)).toArray();

    //System.out.println(longestNonIncreasingSubsequenceLength(numbers, numbers.length));
    longestIncreasingSubsequence(numbers, numbers.length);
  }

  // Binary search
  static int GetCeilIndex(int arr[],
                          int T[], int l,
                          int r, int key)
  {

    while (r - l > 1) {

      int m = l + (r - l) / 2;
      if (arr[T[m]] < key)
        r = m;
      else
        l = m;
    }

    return r;
  }

  static int longestIncreasingSubsequence(
          int arr[], int n) throws Exception
  {

    // Add boundary case, when array n is zero
    // Depend on smart pointers

    int tailIndices[] = new int[n];

    // Initialized with 0
    Arrays.fill(tailIndices, 0);

    int prevIndices[] = new int[n];

    // initialized with -1
    Arrays.fill(prevIndices, -1);

    // it will always point to empty
    // location
    int len = 1;

    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[tailIndices[0]])

        // new smallest value
        tailIndices[0] = i;

      else if (arr[i] <=
              arr[tailIndices[len - 1]]) {

        // arr[i] wants to extend
        // largest subsequence
        prevIndices[i] = tailIndices[len - 1];
        tailIndices[len++] = i;
      }
      else {

        // arr[i] wants to be a potential
        // condidate of future subsequence
        // It will replace ceil value in
        // tailIndices
        int pos = GetCeilIndex(arr,
                tailIndices, -1, len - 1 , arr[i]);
        int ind = 0;
        if (pos == 0) {
          ind = 0;
        } else {
          ind = pos - 1;
        }

        try {
          prevIndices[i] = tailIndices[ind];
          tailIndices[pos] = i;
        } catch (Exception e) {
          throw new Exception(Arrays.toString(arr));
        }
      }
    }

    List<Integer> sequence = new ArrayList<>();

    for (int i = tailIndices[len - 1]; i >= 0; i = prevIndices[i])
      sequence.add(i);


    System.out.println(len);

    Collections.reverse(sequence);
    sequence.stream().map(a -> a + 1).forEach(a -> System.out.print(a + " "));

    return len;
  }
}