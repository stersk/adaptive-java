import java.util.UUID;

public class Account {
  private UUID guid;
  private long balance;

  public Account(UUID guid, long balance) {
    this.guid = guid;
    this.balance = balance;
  }

  public UUID getGuid() {
    return guid;
  }

  public long getBalance() {
    return balance;
  }
}
