import java.util.List;

public class QualityControl {
  public static boolean check(List<Box<? extends Bakery>> boxes) {
    boolean result = true;

    try {
      for (int i = 0; i < boxes.size(); i++) {
        if (boxes.get(i).get() == null) {
          result = false;
          break;
        }

        Class classObject = boxes.get(i).get().getClass();
        if (!((classObject == Bakery.class) || (isBakery(classObject)))) {
          result = false;
          break;
        }
      }
    } catch (Exception e) {
      result = false;
    }

    return result;
  }

  public static boolean isBakery(Class clazz) {
    if (clazz == Object.class) {
      return false;
    }

    Class superClass = clazz.getSuperclass();
    if (superClass == Object.class) {
      return false;
    } else if (superClass == Bakery.class) {
      return true;
    }

    return isBakery(superClass);
  }
}
