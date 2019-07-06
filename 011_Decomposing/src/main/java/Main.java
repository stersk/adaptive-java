import java.lang.reflect.Array;
import java.util.*;

/*
При розкладанні 50-ки:
        45 2 2 1
        45 3 1 1
        45 3 2    : Пропущений 45 4 1
        45 5

Все одно не все виводить
*/

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int inputInt = scanner.nextInt();

    if (inputInt < 1 && inputInt > 40) {  // && на ||
      System.exit(-1);
    }

//    if (inputInt != 5) {
//      throw new Exception(Integer.toString(inputInt));
//    }

    RowGenerator rowGenerator;
    List<int[]> allRows = new ArrayList<>();

    // Переделать для лексикографического порядка
    for (int i = inputInt; i > 0; i--) {
      rowGenerator = new RowGenerator(i, inputInt);
      rowGenerator.generateRows();
      //rowGenerator.printRows();
      allRows.addAll((Collection) rowGenerator.getGeneratedRows());
    }

    allRows.stream()
            .sorted((o1, o2) -> {
              int minCount = (o1.length > o2.length)? o2.length :o1.length;
              for (int i = 0; i < minCount; i++) {
                if (o1[i] != o2[i]) {
                  return (o1[i] > o2[i]) ? 1 : -1;
                }
              }

              if (o1.length == o2.length) {
                return 0;
              } else {
                return (o1.length > o2.length) ? 1 : -1;
              }
            })
            .forEachOrdered(i -> System.out.println(RowGenerator.rowToString(i)));
  }
}

class RowGenerator {
  private int[] row;
  private final int sum;
  private List<int[]> generatedRows = new ArrayList<>();

  public RowGenerator(int cellsCount, int sum) {
    this.sum = sum;
    row = new int[cellsCount];
  }

  public void generateRows() {
    initRow(row, sum);
    while (iterateRow()) {
      addRowToList();
    }
  }

  public List<int[]> getGeneratedRows(){
    return generatedRows;
  }

  public static String rowToString(int[] row){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < row.length; i++){
      sb.append(row[i]);
      if (i < row.length - 1) {
        sb.append(' ');
      }
    }

    return sb.toString();
  }

  private void addRowToList() {
    //if (row.length == 3) {
    generatedRows.add(row.clone());
    //}
  }

  private void initRow(int[] rowForInit, int rowSum) {
    initRowByOnes(rowForInit, rowSum);
    addRowToList();
  }

  private void reinitRow(int[] rowForInit, int rowSum, int startNumber) {
    initRowByOnes(rowForInit, rowSum);

    if (rowForInit.length > 1) {
      for (int i = 0; i < rowForInit.length - 1; i++) {
        if (rowForInit[i] > startNumber) {
          rowForInit[i + 1] += rowForInit[i] - startNumber;
          rowForInit[i] = startNumber;
        }
      }
    }
  }

  private void initRowByOnes(int[] rowForInit, int rowSum) {
    if (rowForInit.length == 1) {
      rowForInit[0] = rowSum;
    } else {
      int counter = rowSum;
      for (int i = rowForInit.length - 1; i > 0; i--) {
        rowForInit[i] = 1;
        counter--;
      }
      rowForInit[0] = counter;
    }
  }

  private boolean iterateRow(){
    boolean result = false;

    if (row.length > 1) {
      int startValue = row[row.length - 1];
      int mainIndex = indexOfFirstValueFromSortedArray(row, startValue);

      for (int i = mainIndex; i > 0; i--){
        if (row[i - 1] - row[i] > 1) {
          row[i - 1]--;
          //row[i]++;
          reinitSubrow(row, i);

          result = true;
          break;

        } else if (row[i - 1] - row[i] == 1){
          int findIndex;
          boolean indexFound = false;
          for (findIndex = i + 1; findIndex < row.length; findIndex++) {
            if (row[findIndex] < row[i]) {
              indexFound = true;
              break;
            }
          }

          if (indexFound) {
            row[findIndex]++;
            row[i - 1]--;

            result = true;
            break;
          }
        }
      }
    }
    return result;
  }

  private static int indexOfFirstValueFromSortedArray(int[] array, int value){
    int result = array.length - 1;
    while (result > 0 && array[result - 1] == value) {
      result--;
    }

    return result;
  }

  private void reinitSubrow(int[] wholeRow, int startIndex) {
    int[] subArray = Arrays.copyOfRange(wholeRow, startIndex, wholeRow.length);
    int sumOcupied = 0;
    for (int i = 0; i < startIndex; i++) {
      sumOcupied += wholeRow[i];
    }

    reinitRow(subArray, sum - sumOcupied, wholeRow[startIndex - 1]);

    for (int i = 0; i < subArray.length; i++) {
      wholeRow[startIndex + i] = subArray[i];
    }
  }
}