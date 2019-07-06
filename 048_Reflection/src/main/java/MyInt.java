import java.io.Serializable;

public class MyInt implements Serializable, Comparable<Integer> {
  public int compareTo(Integer o) {
    return 0;
  }
}

