import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Cake cake = new Cake();
    Paper paper = new Paper();

    BoxImpl<Cake> boxWithCake = new BoxImpl<Cake>();
    boxWithCake.put(cake);

    BoxImpl<Cake> paperWithPaper = new BoxImpl<Cake>();

    List<Box<? extends Bakery>> list = new ArrayList<>();
    list.add(boxWithCake);
    list.add(paperWithPaper);

    boolean result = QualityControl.check(list);
    System.out.println(result);
  }
}
