public class TimeMoment implements Comparable{
  private int hour, minute, second;

  public TimeMoment(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append(hour).append(" ");
    sb.append(minute).append(" ");
    sb.append(second).append(" ");

    return sb.toString();
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public int compareTo(Object o) {
    TimeMoment other = (TimeMoment) o;

    if (hour > other.getHour()) {
      return 1;
    } else if (hour < other.getHour()) {
      return -1;
    } else if (minute > other.getMinute()) {
      return 1;
    } else if (minute < other.getMinute()) {
      return -1;
    } else if (second > other.getSecond()) {
      return 1;
    } else if (second < getSecond()) {
      return -1;
    } else return 0;
  }

  public int compareTo() {
    return 0;
  }
}

