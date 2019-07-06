import java.util.List;

// This quality checker ensures that boxes for sale contain Bakery and anything else
class NaiveQualityControl {

  public static boolean check(List<Box<? extends Bakery>> boxes) {
    // Method signature guarantees that all illegal calls will produce compile-time error... or not?  
    return true;
  }

}