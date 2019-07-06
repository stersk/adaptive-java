import java.util.Date;

public class LogEntry {
  private Date created;

  public Date getCreated() {
    return created;
  }

  public String getLogin() {
    return login;
  }

  public String getUrl() {
    return url;
  }

  public LogEntry(Date created, String login, String url) {
    this.created = created;
    this.login = login;
    this.url = url;
  }

  private String login;
  private String url;
}
