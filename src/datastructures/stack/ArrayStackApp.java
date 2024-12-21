package datastructures.stack;

public class ArrayStackApp {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.printQueue();
        Stacks<Integer> stacks=new Stacks<>();
    //    System.out.println(stacks.isBalancedParentheses("(()))"));
        stacks.push(89);
        stacks.push(3);
        stacks.push(4);
        stacks.printStack();
        stacks.sortStack(stacks);
       stacks.printStack();
    }
}
