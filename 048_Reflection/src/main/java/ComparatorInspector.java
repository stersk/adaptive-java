import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ComparatorInspector {
  public static <T extends Comparable<?>> Type getComparatorType(Class clazz){
    Type type = null;

    Type[] types = clazz.getGenericInterfaces();
    for (int i = 0; i < types.length; i++) {
      if (types[i].getTypeName().startsWith("java.lang.Comparable")) {
        type = types[i];
        break;
      }
    }

    if (type != null) {
      ParameterizedType parameterizedType = (ParameterizedType) type;
      Type[] actualParameters = parameterizedType.getActualTypeArguments();
      if (actualParameters.length != 0) {
        Class<T> persistentClass = (Class<T>) actualParameters[0];
        return persistentClass;
      } else {
        return null;
      }
    }

    return null;
  }
}
