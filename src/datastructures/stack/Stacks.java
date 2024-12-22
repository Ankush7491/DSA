package datastructures.stack;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Stacks <T>{

    @Getter @Setter
    private  ArrayList<T> stackList= new ArrayList<>();

    public void printStack(){
        for(T element:stackList){
            System.out.print(element+" ");
        }
    }

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public int size(){
        return this.getStackList().size();
    }
    public boolean isEmpty(){
        return this.getStackList().size()==0;
    }
    public T peek(){
            if(isEmpty()) return null;
            return this.getStackList().get(this.size()-1);
    }
    public void push(T element){
            this.getStackList().add(element);
    }

    public T pop(){
        T removed=null;
        if(isEmpty()) return removed;
        removed=this.getStackList().get(size()-1);
        this.getStackList().remove(size()-1);
        return removed;
    }

    public String reverseStringArray(String inputString) {
            if(inputString==null) return null;
            char[] inputChars=inputString.toCharArray();
            int charLength=inputChars.length;
            int lastPointer=charLength-1;
            for (int i = 0; i < charLength; i++) {
                if(i<lastPointer){
                    char temp=inputChars[i];
                    inputChars[i]=inputChars[lastPointer];
                    inputChars[lastPointer]=temp;
                    lastPointer--;
                }

        }
            return new String(inputChars);
    }
    public String reverseString(String inputString){
        StringBuilder reversedBuilder=new StringBuilder();
        if(inputString==null) return null;
        for(Character charValue:inputString.toCharArray()){
            this.push((T) charValue);
        }
        while(!isEmpty()){
            reversedBuilder.append(this.pop());
        }

        return reversedBuilder.toString();
    }
    public boolean isBalancedParentheses(String inputString){
        if(inputString==null) return  false;
        char[] chars=inputString.toCharArray();
        if(chars.length==1) return false;
        for(char charValue:chars){
            if(charValue=='(')
                push((T)(Character)charValue);
            if(charValue==')')
            {
                if(isEmpty()) return false;
                pop();
            }
        }
        return isEmpty();
    }
    public void sortStack(Stacks stack){
        if(stack==null) return;
        Stacks<Integer> sortedStack=new Stacks<>();
        while(!stack.isEmpty())
        {
            Integer topOriginal=(Integer) stack.pop();
            while(!sortedStack.isEmpty()&&sortedStack.peek()>topOriginal)
            {
                stack.push((Integer)sortedStack.pop());
            }
             sortedStack.push((Integer)topOriginal );
        }
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }
}
