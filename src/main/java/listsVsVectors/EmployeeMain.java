package listsVsVectors;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee petarHristov= new Employee("Petar","Hristov",123);
        Employee johnAtanasov= new Employee("John","Atanasov",1);
        Employee ivanIvanov = new Employee("Ivan","Ivanov",1234);
        Employee sotirMarinov= new Employee("Sotir","Marinov",12345);
        EmployeeLinkedList list= new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(petarHristov);
        list.addToFront(johnAtanasov);
        list.addToFront(ivanIvanov);
        list.addToFront(sotirMarinov);

        list.printList();

        System.out.println();

        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
