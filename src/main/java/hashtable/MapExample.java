package hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(final String[] args) {
        final Employee janeJones=new Employee("Jane","Jones",123);
        final Employee johnDoe=new Employee("John","Doe",4567);
        final Employee marySmith=new Employee("Mary","Smith",22);
        final Employee mikeWilson=new Employee("Mike","Wilson",3245);
        final Employee billEnd=new Employee("Bill","End",78);

        final Map<String, Employee>hashMap=new HashMap<>();
        hashMap.put("Jones",janeJones);
        hashMap.put("Doe",johnDoe);
        hashMap.put("Smith",janeJones);
        //hashMap.put("Doe",mikeWilson);

        final Employee employee=hashMap.put("Doe",mikeWilson);
        System.out.println(employee.toString());
        System.out.println();
//        System.out.println(hashMap.containsKey("Doe"));
//        System.out.println(hashMap.containsKey(janeJones));
        //        Iterator<Employee>iterator=hashMap.values().iterator();
        //        while (iterator.hasNext()){
        //            System.out.println(iterator.next());
        //        }
        hashMap.forEach((k,v)-> System.out.println("Key= "+k+ ", Employee= "+v));
    }
}
