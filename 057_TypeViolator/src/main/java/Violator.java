import java.util.ArrayList;
import java.util.List;

/**
 * Class to work with
 */
class Violator {

  public static List<Box<? extends Bakery>> defraud() {
    List<Box<? extends Bakery>> cakes;
    cakes = new ArrayList<Box<? extends Bakery>>();
    Box<Bakery> firstCake = new Box<Bakery>();
    firstCake.put(new Cake());
    cakes.add(firstCake);

    Box<Bakery> secondCake = new Box<Bakery>();
    cakes.add(secondCake);

    Box rawBox = (Box) secondCake;
    rawBox.put(new Paper());

    return cakes;
  }
}