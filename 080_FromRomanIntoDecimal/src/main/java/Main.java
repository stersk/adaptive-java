import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String romeNumber = scanner.nextLine();

    Map<Character, Integer> translateMap = new HashMap<>();
    translateMap.put('I', 1);
    translateMap.put('V', 5);
    translateMap.put('X', 10);
    translateMap.put('L', 50);
    translateMap.put('C', 100);
    translateMap.put('D', 500);
    translateMap.put('M', 1000);

    char[] numberElements = romeNumber.toCharArray();
    int result = 0;
    List<Integer> list = new ArrayList<>();

    Character character = Character.toUpperCase(numberElements[0]);
    int resultPart = translateMap.get(character);

    if (numberElements.length > 1) {
      for (int i = 1; i < numberElements.length; i++){
        if (character.equals(Character.toUpperCase(numberElements[i]))) {
          resultPart += translateMap.get(Character.toUpperCase(numberElements[i]));
        } else {
          list.add(resultPart);
          character = Character.toUpperCase(numberElements[i]);
          resultPart = translateMap.get(character);
        }
      }
    }

    list.add(resultPart);

    if (list.size() == 1) {
      result = list.get(0);
    } else {

      for (int i = 1; i < list.size(); i++) {
        if (list.get(i - 1) != 0 && list.get(i) > list.get(i - 1)) {
          list.set(i - 1, list.get(i) - list.get(i - 1));
          list.set(i, 0);
        }
      }

      result = list.stream().mapToInt(a -> a.intValue()).sum();
    }

    System.out.println(result);
  }
}