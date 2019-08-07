import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    List<Integer> longestList = findSubsequence(array);

    longestList.stream().forEach(i -> System.out.print(i + " "));
  }

  public static List<Integer> findSubsequence(int[] arrA) {
    int[] LIS = new int[arrA.length];
    for (int i = 0; i < arrA.length; i++) {
      int max = -1;
      for (int j = 0; j < i; j++) {
        if (arrA[i] > arrA[j]) {
          if (max == -1 || max < LIS[j] + 1) {
            max = 1 + LIS[j];
          }
        }
      }
      if (max == -1) {
        max = 1;
      }
      LIS[i] = max;
    }
    // find the max in the LIS[]
    int result = -1;
    int index = -1;
    for (int i = 0; i < LIS.length; i++) {
      if (result < LIS[i]) {
        result = LIS[i];
        index = i;
      }
    }
    // Print the result
    // Start moving backwards from the end and
    List<Integer> list = new ArrayList<>();

    list.add(arrA[index]);
    int res = result-1;
    for (int i = index-1; i >= 0; i--) {
      if(LIS[i]==res){
        list.add(arrA[i]);
        res--;
      }
    }

    Collections.sort(list);
    return list;
  }
}
