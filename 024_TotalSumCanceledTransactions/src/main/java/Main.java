import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Transaction> transactions = new ArrayList<Transaction>();
    transactions.add(new Transaction("774cedda-9cde-4f53-8bc2-5b4d4859772a", State.CANCELED, 1000L));

    List<Account> accaunts = new ArrayList<Account>();
    accaunts.add(new Account("1001", 0L, transactions));

    transactions = new ArrayList<Transaction>();
    transactions.add(new Transaction("337868a7-f469-43c0-9042-3422ce37ee26a", State.FINISHED, 8000L));
    transactions.add(new Transaction("f8047f86-89e7-4226-8b75-74c55a4d7e31", State.CANCELED, 10000L));
    accaunts.add(new Account("1002", 8000L, transactions));
    long canceledTransactionsCount = calcSumOfCanceledTransOnNonEmptyAccounts(accaunts);
    System.out.println(canceledTransactionsCount);
  }

  public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
    return accounts.stream().filter(account -> account.getBalance() > 0).flatMap(a -> a.getTransactions().stream().filter(b -> b.getState() == State.CANCELED)).mapToLong(value -> value.getSum()).sum();
  }
}
