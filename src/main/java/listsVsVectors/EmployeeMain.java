package listsVsVectors;

public class EmployeeMain {

    public static void main(final String[] args) {
        final Employee petarHristov= new Employee("Petar","Hristov",123);
        final Employee johnAtanasov= new Employee("John","Atanasov",1);
        final Employee ivanIvanov = new Employee("Ivan","Ivanov",1234);
        final Employee sotirMarinov= new Employee("Sotir","Marinov",12345);
        final EmployeeLinkedList list= new EmployeeLinkedList();
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
