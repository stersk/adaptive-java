import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private String code;
  private List<Employee> employees;

  public Department(String name, String code) {
    this.name = name;
    this.code = code;
    employees = new ArrayList<Employee>();
  }

  public String getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  public List<Employee> getEmployees() {
    List<Employee> returnList = new ArrayList<Employee>();
    returnList.addAll(employees);
    return  returnList;
  }

  public void addEmployees(Employee employee){
    employees.add(employee);
  }
}
