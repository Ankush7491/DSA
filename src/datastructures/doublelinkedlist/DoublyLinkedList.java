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
            removedNode.prev=null;
            return removedNode;
        }
        removedNode=this.tail;
        this.tail=this.tail.prev;
        this.tail.next=null;
        removedNode.prev=null;
        length--;
        return removedNode;
    }
    public void prepend(int value){
        Node newNode=new Node(value);
        if(head==null) {
            this.head=newNode;
            this.tail=newNode;
        }else{
            newNode.next=this.head;
            this.head.prev=newNode;
            this.head=newNode;
        }
        length++;

    }
    public Node removeFirst(){
        Node removedNode=null;
        if(this.head==null) return null;
        removedNode=this.head;

        if(this.length==1){
            this.head=null;
            this.tail=null;
        }else{
            this.head=this.head.next;
            this.head.prev=null;
        }
        removedNode.next=null;
        length--;
        return removedNode;
    }
    public void printList(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.value+ "  ");
            currentNode=currentNode.next;
        }
        System.out.println("End List");
    }
    public Node get(int index){
        Node temp=null;
        if(index<0||index>=length) return null;
        if(index<length/2){
            temp=head;
            for (int i = 0; i < length; i++) {
                if(i==index) return temp;
                 temp=temp.next;
            }
        }else{
            temp=tail;
            for (int j = length-1; j >=0; j--) {
                if(j==index)
                    return temp;
                 temp=temp.prev;
            }
        }

        return temp;
    }
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value){
        Node toBeInserted=new Node(value);
        if(index==0)
        {
            this.prepend(value);
            return true;
        } else if (index==length) {
            this.append(value);
            return true;
        }
        if (index>length||index<0) {
            return false;
        }
        Node before=get(index-1);
        toBeInserted.next=before.next;
        toBeInserted.prev=before;
        before.next=toBeInserted;
        Node after=toBeInserted.next;
        after.prev=toBeInserted;
        length++;
        return true;
    }
    public Node remove(int index){
        if(index<0||index>=length) return null;
        if(index==0) return this.removeFirst();
        if(index==length-1) return this.removeLast();
        Node before=this.get(index-1);
        Node removedNode=before.next;
        before.next=removedNode.next;
        removedNode.next.prev=before;
        removedNode.next=null;
        removedNode.prev=null;
        length--;
        return removedNode;
    }
    public void swapFirstLast(){
        if(this.head==this.tail) return;
        int val=0;
        val=this.head.value;
        this.head.value=this.tail.value;
        this.tail.value=val;
    }
    public void reverse(){
        if(this.head==null) return;
        Node temp=this.head;
        Node after=temp.next;
        Node before=null;
        this.head=this.tail;
        this.tail=temp;
        while(temp!=null){
            temp.next=before;
            before=temp;
            temp.prev=after;
            temp=after;
            if(after!=null)
            after=after.next;
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
