package datastructures.stack;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Stack {
    @Getter Node top;
    @Getter int height;

    public Stack(int value){
        Node node=new Node(value);
        this.top=node;
        this.height=1;
    }
    public void printStack(){
        System.out.println("Top");
        if(top==null) return;
        while(top!=null){
            System.out.print(top.value+ "  ");
            top=top.next;
        }
    }

    @ToString
    class Node{
        Node next;
        int value;
        Node(int value){
            this.value=value;
        }
    }
}
