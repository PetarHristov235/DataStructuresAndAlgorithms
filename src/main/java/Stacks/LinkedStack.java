package Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private final LinkedList<Employee>stack;
    public LinkedStack(){
        stack=new LinkedList<Employee>();
    }

    public void  push(final Employee employee){
        stack.push(employee);
    }
    public Employee pop(){
        return stack.pop();
    }
    public Employee peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public  void printStack(){
        final ListIterator<Employee>iterator=stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
