import java.util.List;

class ListMultiplicator {

  /**
   Multiplies original list provided numper of times

   @param list list to multiply
   @param n times to multiply, should be zero or greater
   */
  public static void multiply(List<?> list, int n) {
    multiplyHelper(list, n);
  }

  private static <T> void multiplyHelper(List<T> list, int n) {
    if (n == 0) {
      list.clear();
    } else {
      int size = list.size();
      for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < size; j++) {
          list.add(list.get(j));
        }
      }
    }
  }

}