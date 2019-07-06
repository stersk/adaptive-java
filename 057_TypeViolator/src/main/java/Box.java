public class Box<T> {
  private T value;

  public void put(T item){
    value = item;
  }
  public T get(){
    return value;
  }
}