import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<LogEntry> logs = new ArrayList<>();

    logs.add(new LogEntry(new Date(), "user1", "google.com.ua"));
    logs.add(new LogEntry(new Date(), "user2", "google.com"));
    logs.add(new LogEntry(new Date(), "user1", "google.com.ua"));

    Map<String, Long> clickCount = logs.stream().collect(Collectors.groupingBy(LogEntry::getUrl, Collectors.counting()));
  }
}
