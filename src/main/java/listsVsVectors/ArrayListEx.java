package listsVsVectors;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Petar", "Hristov", 123));
        employeeList.add(new Employee("John", "Atanasov", 1));

        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
}

