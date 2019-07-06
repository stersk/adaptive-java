public class Account {
  public Account(String number, long balance) {
    this.number = number;
    this.balance = balance;
  }

  public String getNumber() {
    return number;
  }

  public long getBalance() {
    return balance;
  }

  private String number;
  private long balance;
}
