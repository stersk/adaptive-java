import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class Main {
  private static final Set<User> users = new HashSet<>();

  public static void main(String[] args) {
    Account accOne = new Account(UUID.randomUUID(), 1000);
    Account accTwo = new Account(UUID.randomUUID(), 2000);

    users.add(new User("user1", accOne));
    users.add(new User("user2", accTwo));

    printBalanceIfNotEmpty("user1");
  }

  public static Optional<User> findUserByLogin(String login) {
    return users.stream().filter(user -> user.getLogin().equals(login)).findAny();
  }

  public static void printBalanceIfNotEmpty(String userLogin) {
    Optional<User> user = findUserByLogin(userLogin);
    user.ifPresent(user1 -> {
      Optional.ofNullable(user1.getAccount()).ifPresent(balance1 -> {
        if (balance1.getBalance() > 0) {
          System.out.println(new StringBuilder(userLogin).append(": ").append(balance1.getBalance()));
        }
      });
    });
  }
}
