package dsa.linkedlist;

import lombok.ToString;

@ToString
public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;
    SingleLinkedList(int nodeValue){
        Node temp=new Node(nodeValue);
        head=temp;
        tail=temp;
        size++;
    }
    public void insert(int nodeValue,int locationIndex){
        if(head==null) {
            new SingleLinkedList(nodeValue);
            return;
        }
        if(locationIndex>size-1) return;
        if(locationIndex==0) {
            prepend(nodeValue);
            return;
        }
        if(locationIndex==size-1) {
            append(nodeValue);
            return;
        }
        int counter=0;
        Node currentNode=head;
        while(currentNode.next!=null){
            if(counter+1==locationIndex)
            {
                Node dummyNode=new Node(nodeValue);
                dummyNode.next=currentNode.next;
                currentNode.next=dummyNode;
                size++;
                return;
            }
        }
    }

    public void append(int nodeValue) {
        if(head==null) {
            new SingleLinkedList(nodeValue);
            return;
        }
        Node dummyNode=new Node(nodeValue);
        tail.next=dummyNode;
        tail=dummyNode;
        size++;
    }

    public void prepend(int nodeValue) {
        if(head==null) {
            new SingleLinkedList(nodeValue);
            return;
        }
        Node dummyNode=new Node(nodeValue);
        dummyNode.next=head;
        head=dummyNode;
        size++;
    }
    public void traverse(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.value+ " || ");
            currentNode=currentNode.next;
        }
        System.out.println();
    }
    public boolean search(int nodeValue){
        Node currentNode=head;
        while(currentNode!=null){
            if(currentNode.value==nodeValue) return true;
            currentNode=currentNode.next;
        }
        return false;
    }
    public int searchIndex(int nodeValue){
        Node currentNode=head;
        int counter=0;
        while(currentNode!=null){
            if(currentNode.value==nodeValue) return counter;
            currentNode=currentNode.next;
            counter++;
        }
        return -1;
    }
    public boolean delete(int locationIndex){
        if(head==null) return false;
        if(locationIndex>size-1)return false;
        if(head==tail&&locationIndex==0){
            head=null;
            tail=null;
            size--;
            return true;
        }
        int counter=0;
        Node currentNode=head;
        while(counter!=locationIndex-1){
            currentNode=currentNode.next;
            counter++;
        }
        Node toBeDeleted=currentNode.next;
        currentNode.next=toBeDeleted.next;
        toBeDeleted.next=null;
        if(toBeDeleted==head) head=currentNode;
        if(toBeDeleted==tail) tail=currentNode;
        size--;
        return true;
    }
    public void deleteEntireList(){
        head=null;
        tail=null;
        size=0;
    }
    public void push(int nodeValue){
        append(nodeValue);
    }

}
