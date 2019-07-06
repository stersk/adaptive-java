import java.util.Date;

public class Transaction {
  private String uuid;
  private State state;
  private Long sum;

  public String getUuid() {
    return uuid;
  }

  public State getState() {
    return state;
  }

  public Long getSum() {
    return sum;
  }

  public Transaction(String uuid, State state, Long sum) {
    this.uuid = uuid;
    this.state = state;
    this.sum = sum;
  }
}
