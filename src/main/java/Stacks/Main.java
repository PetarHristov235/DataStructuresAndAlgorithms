package Stacks;

public class Main {

    public static void main(final String[] args) {
        final Employee janeJones=new Employee("Jane","Jones",123);
        final Employee johnDoe=new Employee("John","Doe",4567);
        final Employee marySmith=new Employee("Mary","Smith",22);
        final Employee mikeWilson=new Employee("Mike","Wilson",3245);
        final Employee billEnd=new Employee("Bill","End",78);

     //   final ArrayStack stack=new ArrayStack(10);
        final LinkedStack stack=new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        stack.printStack();
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();
        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();
        stack.printStack();

    }

}
