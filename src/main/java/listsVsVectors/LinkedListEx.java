package listsVsVectors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(final String[] args) {
        final Employee petarHristov = new Employee("Petar", "Hristov", 123);
        final Employee johnAtanasov = new Employee("John", "Atanasov", 1);
        final Employee ivanIvanov = new Employee("Ivan", "Ivanov", 1234);
        final Employee sotirMarinov = new Employee("Sotir", "Marinov", 12345);
        final List<Employee> employeeLinkedList=new LinkedList<>();

        final Iterator iterator = employeeLinkedList.iterator();
        System.out.println("HEAD ->");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("<=>");
        }

        for (final Employee employee : employeeLinkedList) {
            System.out.println(employee);
        }
    }
}
