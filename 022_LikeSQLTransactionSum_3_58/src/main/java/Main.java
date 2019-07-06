import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
  public static Boolean identify(String word) {
    boolean result = ;
    return Boolean.valueOf(result);
  }

  public static void main(String[] args) {
    Account account1 = new Account("Account 1", 500);
    Account account2 = new Account("Account 3", 1500);

    List<Transaction> transactions = new ArrayList<>();
    transactions.add(new Transaction("001", 100, account2));
    transactions.add(new Transaction("002", 200, account1));
    transactions.add(new Transaction("003", -300, account2));

    Map<String, Long> totalSumOfTransByEachAccount =
            transactions.stream()
                    .collect(Collector.of(
                            HashMap::new, // метод инициализации аккумулятора
                            (b ,s) -> b.merge(s.getAccount().getNumber(), s.getSum(), (a1,a2) -> Long.valueOf(a1.longValue() + a2.longValue())), // метод обработки каждого элемента
                            (l1, l2) -> l1 = l2 // метод соединения двух аккумуляторов при параллельном выполнении
                    ));

    String[] words = new String[]{"aaaa","aa","a","aaa"};

    Map<Boolean, List<String>> map =
            Arrays.stream(words).collect(Collectors.partitioningBy(word -> new StringBuilder().append(word).reverse().toString().equals(word)));
       /*     Arrays.stream(words).collect(
                    Collectors.groupingBy(s -> new Boolean(), Collectors.toList());
*/  }

}
