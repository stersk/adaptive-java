import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> rows = new ArrayList<>();
    String row = "";

    do {
      row = scanner.nextLine();
      if (!row.equals("end")){
        rows.add(row);
      }
    } while (!row.equals("end"));

    int[][] mainArray = new int[rows.size()][rows.get(0).split(" ").length];

    for (int i = 0; i < rows.size(); i++) {
      int[] rowValues = Arrays.stream(rows.get(i).split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();
      for (int j = 0; j < rowValues.length; j++) {
        mainArray[i][j] = rowValues[j];
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < mainArray.length; i++) {
      sb.setLength(0);

      for (int j = 0; j < mainArray[i].length; j++){
        sb.append(processArrayCell(i,j,mainArray)).append(" ");
      }

      System.out.println(sb);
    }
  }

  private static int processArrayCell(int i, int j, int[][] array) {
    int result = 0;
    result += array[(i-1 < 0)?array.length - 1: i - 1][j];
    result += array[(i+1 >= array.length)? 0: i + 1][j];
    result += array[i][(j+1 >= array[0].length)? 0: j + 1];
    result += array[i][(j-1 < 0)?array[0].length - 1: j - 1];

    return result;
  }
}