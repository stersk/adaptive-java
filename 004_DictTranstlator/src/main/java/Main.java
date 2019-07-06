import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    InputStreamReader reader = new InputStreamReader(System.in);
    Scanner scanner = new Scanner(reader);
    int lines = Integer.parseInt(scanner.nextLine());
    LinkedHashMap<String, List<String>> englishSpanishTranstalor = new LinkedHashMap<>();

    for (int i = 0; i < lines; i++){
      StringTokenizer stringLanguageTokenizer = new StringTokenizer(scanner.nextLine(), "-");
      String word = stringLanguageTokenizer.nextToken().replaceAll("\\s+","");

      List<String> otherWords;
      StringTokenizer otherWordsTokens = new StringTokenizer(stringLanguageTokenizer.nextToken(), ",");
      while (otherWordsTokens.hasMoreTokens()) {
        String nextToken = otherWordsTokens.nextToken().replaceAll("\\s+","");
        otherWords = englishSpanishTranstalor.get(nextToken);
        if (otherWords == null) {
          otherWords = new ArrayList<>();
          otherWords.add(word);
          englishSpanishTranstalor.put(nextToken, otherWords);
        } else {
          otherWords.add(word);
        }
      }
    }

    LinkedHashMap<String, List<String>> sortedEnglishSpanishTranstalor = englishSpanishTranstalor.entrySet().stream()
            .sorted((o1, o2)->o1.getKey().compareTo(o2.getKey()))
            .map(entry -> {
      List<String> sortedList = entry.getValue().stream().sorted().collect(Collectors.toList());
      entry.setValue(sortedList);
      return entry;
    }).collect(Collectors.toMap(mainEntry -> mainEntry.getKey(), mainEntry -> mainEntry.getValue(),
                    (e1, e2) -> e1,
                    LinkedHashMap::new));

    StringBuilder sb;
    List wordList;
    System.out.println(sortedEnglishSpanishTranstalor.size());
    for (Map.Entry<String, List<String>> entry : sortedEnglishSpanishTranstalor.entrySet()) {
      sb = new StringBuilder();
      sb.append(entry.getKey());
      sb.append(" - ");
      wordList = entry.getValue();
      for (int i = 0; i < wordList.size(); i++){
        sb.append(wordList.get(i));
        if (i < wordList.size() - 1) {
          sb.append(", ");
        }
      }

      System.out.println(sb.toString());
    }
  }
}
