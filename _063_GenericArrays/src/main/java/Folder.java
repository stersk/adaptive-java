class Folder<T> {
  private T item;

  public void put(T item) {
    this.item = item;
  }

  public T get() {
    return this.item;
  }
}