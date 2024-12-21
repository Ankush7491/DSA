package datastructures.stack;

public class MyQueue {
    private Stacks<Integer> stack1;
    private Stacks<Integer> stack2;

    public MyQueue() {
        stack1 = new Stacks<>();
        stack2 = new Stacks<>();
    }

    public void enqueue(int value){
        if(stack1.isEmpty())
        stack1.push(value);
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

    }

    public Integer dequeue(){
        if(stack1.isEmpty()) return null;
        else {
            int removed=stack1.pop();
            return removed;
        }
    }
    public void printQueue(){
        for(Integer integer:stack1.getStackList()){
            System.out.print(integer+"  ");
        }
        System.out.println(" ");
    }
    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
