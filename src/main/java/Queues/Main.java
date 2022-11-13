package Queues;


import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Collection;

public class Main {

    public static void main(final String[] args) {
        final Employee janeJones=new Employee("Jane","Jones",123);
        final Employee johnDoe=new Employee("John","Doe",4567);
        final Employee marySmith=new Employee("Mary","Smith",22);
        final Employee mikeWilson=new Employee("Mike","Wilson",3245);
        final Employee billEnd=new Employee("Bill","End",78);

        final ArrayQueue arrayQueue= new ArrayQueue(10);
        arrayQueue.add(janeJones);
        arrayQueue.add(johnDoe);
        arrayQueue.add(marySmith);
        arrayQueue.add(mikeWilson);
        arrayQueue.add(billEnd);
        arrayQueue.printQueue();
        System.out.println();

        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.printQueue();
        System.out.println();

        System.out.println(arrayQueue.peek());

        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.printQueue();
    }
}
