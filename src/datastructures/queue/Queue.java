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
        while(first!=null){
            System.out.print(first.value+" ");
            first=first.next;
        }
    }
    public void enqueue(int value){
        Node newNode=new Node(value);
        if(last!=null)
        {
            last.next=newNode;
            last=newNode;
        }else{
            first=newNode;
            last=newNode;
        }
        length++;
    }
    public Node dequeue(){
        Node removedNode=null;
        if(first==null) return removedNode;
        if(first.next==null){
            removedNode=first;
            first=null;
            last=null;
        }else{
            removedNode=first;
            first=first.next;
        }
        removedNode.next=null;
        length--;
        return removedNode;
    }
}
