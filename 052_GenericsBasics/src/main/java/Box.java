public class Box<T> {
  private T input;

  public T get() {
    return input;
  }

  public void put(T input) {
    this.input = input;
  }
}
