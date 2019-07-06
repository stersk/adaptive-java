import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    String text = "Create a stream that will detect bad words in a text according to a bad words list. All words in the text are divided by whitespaces (always only one whitespace between two words).";
    List<String> badDowds = new ArrayList<String>();
    badDowds.add("words");
    badDowds.add("word");
    badDowds.add("according");

    List<String> words = createBadWordsDetectingStream(text, badDowds).collect(Collectors.toList());
  }

  public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
    return Stream.of(text.split(" "))
            .map (elem -> new String(elem))
    .distinct().filter(a -> badWords.stream().anyMatch(element -> a.equals(element))).sorted();
  }

}
