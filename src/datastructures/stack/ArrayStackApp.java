package datastructures.stack;

public class ArrayStackApp {
    public static void main(String[] args) {
        Stacks<Character> stacks=new Stacks<>();
        System.out.println(stacks.reverseString("this is too good"));
        stacks.printStack();
//        stacks.push(89);
//        stacks.push(3);
//        stacks.push(4);
//        System.out.println(stacks.pop());
    }
}
