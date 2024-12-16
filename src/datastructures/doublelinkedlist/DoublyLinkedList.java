package datastructures.doublelinkedlist;

import lombok.Getter;
import lombok.ToString;

@ToString
public class DoublyLinkedList {
    @Getter
    private Node head;
    @Getter
    private Node tail;
    @Getter
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head=newNode;
        this.tail=newNode;
        length=1;
    }
    public void append(int value){
        Node newNode=new Node(value);

        if(this.length==0){
            this.head=newNode;
            this.tail=newNode;
        }
        else {
            this.tail.next=newNode;
            newNode.prev=this.tail;
            this.tail=newNode;
        }

        length++;
    }
    public Node removeLast(){
        Node removedNode=null;
        if(head==null) return null;
        if(head.next==null){
            removedNode=this.head;
            this.head=null;
            this.tail=null;
            length=0;
            return removedNode;
        }
        removedNode=this.tail;
        this.tail=this.tail.prev;
        this.tail.next=null;
        length--;
        return removedNode;
    }
    public void prepend(int value){
        Node newNode=new Node(value);

    }
    public void printList(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.println(currentNode.value);
            currentNode=currentNode.next;
        }
    }
    @ToString
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
}
