public class Point implements Comparable{
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int compareTo(Object o) {
    Point object = (Point) o;
    if (object.getX() > x) {
      return -1;
    } else if (object.getX() < x) {
      return 1;
    } else if (object.getY() > y) {
      return -1;
    } else if (object.getY() < y) {
      return 1;
    } else return 0;
  }

  public static float f(float x){
    if (x <= 2){
      return 1 - (float) Math.pow(2 + x, 2);
    } else if (x <= 2) {
      return - x/2;
    } else {
      return (float) Math.pow(x - 2, 2) + 1;
    }
  }

}
