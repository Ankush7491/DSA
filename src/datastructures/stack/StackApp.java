package datastructures.stack;

public class StackApp {
    public static void main(String[] args) {
        Stack stack=new Stack(7 );
        stack.push(13);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop());
        stack.printStack();
    }

}
