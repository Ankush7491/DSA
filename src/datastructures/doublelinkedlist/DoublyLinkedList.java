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

    @ToString
    class Node{
        int value;
        Node next;
        Node previous;
        Node(int value){
            this.value=value;
        }
    }
}
