import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafe6Quiz {
  public static class ThreadSafe6 {
    private final Map< String, String > data = new
            ConcurrentHashMap<String, String>();
    public void putIfAbsent(final String key, final String value) {
      data.putIfAbsent(key, value);
    }
  }
}