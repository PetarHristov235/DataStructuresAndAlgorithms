package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
private Employee[] stack;
private int top;

public ArrayStack(final int capacity){
    stack=new Employee[capacity];
}
public void push(final Employee employee){
    if(top== stack.length){
       final Employee[] newArray=new Employee[2* stack.length];
       System.arraycopy(stack,0,newArray,0,stack.length);
        stack=newArray;
    }

    stack[top++]=employee;
    }
public Employee pop(){
if (isEmpty()){
    throw new EmptyStackException();
}
final Employee employee=stack[--top];
stack[top]=null;
return employee;
}
public Employee peek(){
    if(isEmpty()){
        throw  new EmptyStackException();
    }
    return stack[top-1];
}
public int size(){
    return top;
}
public boolean isEmpty(){
    return 0 == top;
}
public void printStack(){
    for (int i = top-1; 0 <= i; i--) {
        System.out.println(stack[i]);
    }
}
}
