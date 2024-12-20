package datastructures.queue;

import lombok.Getter;
import lombok.ToString;
@ToString
public class Queue {
    @Getter Node first;
    @Getter Node last;
    @Getter int length;
    public Queue(int value){
        Node node=new Node(value);
        this.first=node;
        this.last=node;
        length=1;
    }
    @ToString
    class Node{
        Node next;
        int value;
        Node(int value){
            this.value=value;
        }
    }
    public void printQueue(){
        if(first==null)return;
        System.out.println("First");
        while(first!=null){
            System.out.print(first.value+" ");
            first=first.next;
        }
    }
}
