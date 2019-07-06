public class BoxImpl<T> implements Box<T> {
  private T value = (T) new Object();
  public void put(T item) {
      value = item;
  }

  public T get() {
    return value;
  }
}
