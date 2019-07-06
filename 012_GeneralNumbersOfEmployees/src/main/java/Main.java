import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    List<Department> departments = new ArrayList<Department>();

    Department department = new Department("dep-1", "111-1");
    Employee employee = new Employee("William", 20000L);
    department.addEmployees(employee);
    employee = new Employee("Sophia", 10000L);
    department.addEmployees(employee);
    departments.add(department);


    department = new Department("dep-2", "222-1");
    employee = new Employee("John", 50000L);
    department.addEmployees(employee);
    departments.add(department);

    Scanner scanner = new Scanner(System.in);
    long threshold = scanner.nextLong();

    System.out.println(calcNumberOfEmployees(departments, threshold));
  }

  /**
   * Calculates the number of employees with salary >= threshold (only for 111- departments)
   *
   * @param departments are list of departments
   * @param threshold is lower edge of salary
   *
   * @return the number of employees
   */
  public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
    return departments.stream().filter(a -> a.getCode().startsWith("111-"))
            .flatMap(department -> department.getEmployees().stream())
            .filter(employee -> employee.getSalary().compareTo((Long) threshold) >= 0).count();
  }
}
