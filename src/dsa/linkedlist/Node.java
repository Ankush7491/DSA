package dsa.linkedlist;

import lombok.ToString;

@ToString
public class Node {
    public int value;
    public Node next;
    Node(int value){
        this.value=value;
    }
}
