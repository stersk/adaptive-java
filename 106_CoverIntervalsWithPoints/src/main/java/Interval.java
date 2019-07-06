public class Interval implements Comparable<Interval> {
  private int a;
  private int b;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  @Override
  public int hashCode() {
    int result = a;
    result = 31 * result + b;
    return result;
  }

  public void setB(int b) {
    this.b = b;
  }

  public Interval(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Interval{");
    sb.append("a=").append(a);
    sb.append(", b=").append(b);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj.getClass() != Interval.class) {
      return false;
    }

    Interval objInterval = (Interval) obj;
    if (a != objInterval.getA()) {
      return false;
    } else {
      return (b == objInterval.getB());
    }
  }

  @Override
  public int compareTo(Interval o) {
    if (b > o.getB()) {
      return 1;
    } else if (b < o.getB()) {
      return -1;
    } else if (a > o.getA()) {
      return 1;
    } else if (a < o.getA()) {
      return -1;
    } else {
      return 0;
    }
  }

  public boolean containPoint(Integer point) {
    return (a <= point && b >= point);
  }
}
