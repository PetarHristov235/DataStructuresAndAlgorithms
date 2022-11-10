package hashtable;
//This simpleHashTable does not handle collisions.
public class SimpleHashTable {
    private final Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }
    public void put(final String key, final Employee employee){
        int hashedKey=hashKey(key);
        if(occupied(hashedKey)){
            final int stopIndex=hashedKey;
            if(hashedKey== hashtable.length-1){
                hashedKey=0;
            }else{
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey!=stopIndex){
                hashedKey=(hashedKey+1)%hashtable.length;
            }
        }
        if(null != hashtable[hashedKey]){
            System.out.println("Sorry, there is already an employee at position "+ hashedKey);
        }else{
            hashtable[hashedKey]=employee;
        }
    }
    public Employee get(final String key){
        final int hashedKey=hashKey(key);
    return hashtable[hashedKey];
    }
    private int hashKey(final String key){
        return key.length()%hashtable.length;
    }

    private boolean occupied(final int index){
        return null != hashtable[index];
    }
    public void printHashTable(){
        for (Employee employee : hashtable) {
            System.out.println(employee);
        }
    }
}
