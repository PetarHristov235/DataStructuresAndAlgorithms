package hashtable;

import hashtable.Employee;


public class Main {

    public static void main(final String[] args) {
        final Employee janeJones=new Employee("Jane","Jones",123);
        final Employee johnDoe=new Employee("John","Doe",4567);
        final Employee marySmith=new Employee("Mary","Smith",22);
        final Employee mikeWilson=new Employee("Mike","Wilson",3245);
        final Employee billEnd=new Employee("Bill","End",78);

        final SimpleHashTable hashTable=new SimpleHashTable();
        hashTable.put("Jones",janeJones);
        hashTable.put("Doe",johnDoe);
        hashTable.put("Wilson",mikeWilson);
        hashTable.put("Smith",marySmith);

        hashTable.printHashTable();
        System.out.println();
        System.out.println("Retrieve key Wilson: "+hashTable.get("Wilson"));
        System.out.println();
        System.out.println("Retrieve key Smith: "+hashTable.get("Smith"));

    }
}
