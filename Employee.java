import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
    String firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}

class Mapping {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Zeynab", "SH", 1200));
        employees.add(new Employee("Nahida", "Aydinli", 1800));
        employees.add(new Employee("Maryam", "Aliyeva", 1800));

        Function<Employee, String> formatCard =
                e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee employee : employees) {
            System.out.println(formatCard.apply(employee));
            System.out.println(salaryPicker.apply(employee));
            System.out.println();
        }
    }
}
