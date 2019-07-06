public class Employee {
  private String name;

  public String getName() {
    return name;
  }

  public Long getSalary() {
    return salary;
  }

  private Long salary;

  public Employee(String name, Long salary) {
    this.name = name;
    this.salary = salary;
  }
}
