import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String key = scanner.nextLine();
    String value = scanner.nextLine();
    String toEncode = scanner.nextLine();
    String toDecode = scanner.nextLine();

    Map<Character,Character> encodeMap = new HashMap<>();
    final Map<Character,Character> decodeMap = new HashMap<>();

    for (int i = 0; i < key.length(); i++) {
      encodeMap.put(key.charAt(i), value.charAt(i));
    }

    encodeMap.forEach((k,v) -> decodeMap.put(v,k));

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < toEncode.length(); i++) {
      sb.append(encodeMap.get(toEncode.charAt(i)));
    }

    System.out.println(sb);

    sb.setLength(0);
    for (int i = 0; i < toDecode.length(); i++) {
      sb.append(decodeMap.get(toDecode.charAt(i)));
    }

    System.out.println(sb);
  }
}