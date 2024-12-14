package datastructures.linkedlist;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class LinkedList {
    @Getter @Setter private Node head;
    @Getter @Setter    private Node tail;
    @Getter @Setter private int length;

    public LinkedList(int value) {
        Node objNode = new Node(value);
        this.head=objNode;
        this.tail=objNode;
        this.length=1;
    }
    public void printList(){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.getValue());
            temp=temp.getNext();
        }
    }
    public void append(int value){
        Node newNode= new Node(value);
        if(length==0){
            head=newNode;
            tail= newNode;
        }else{
            this.tail.next=newNode;
            this.tail=newNode;
        }
        length++;
    }
    public Node removeLast(){
       Node removedNode=null;
        switch(length){
            case 0:
            System.out.println("List is empty");
            break;
            case 1:
                removedNode=head;
                head=null;
                tail=null;
                length=0;
            break;
            default:
               removedNode= iterateAndRemoveLast();
                break;
        }
        return removedNode;
    }

    private Node iterateAndRemoveLast() {
        Node preNode=head;
        Node tempNode=head;
        while(tempNode.getNext()!=null) {
            preNode = tempNode;
            tempNode = preNode.getNext();
        }
        this.tail=preNode;
        this.tail.setNext(null);
        length--;
        return tempNode;
    }
    public void prepend(int value){
        Node objNode=new Node(value);
        if(this.getLength()==0){
            this.setHead(objNode);
            this.setTail(objNode);
        }else{
            objNode.setNext(this.getHead());
            this.setHead(objNode);
        }
        this.setLength(this.getLength()+1);
    }
    public Node removeFirst(){
        Node removedNode=null;
        switch(length){
            case 0:
                System.out.println("List is empty");
                break;
            case 1:
                removedNode=head;
                removedNode.setNext(null);
                head=null;
                tail=null;
                length=0;
                break;
            default:
                removedNode= this.getHead();
                this.setHead(this.getHead().getNext());
                this.setLength(length-1);
                removedNode.setNext(null);
                break;
        }
        return removedNode;
    }
    public Node get(int index){
        if(this.getLength()==0) return null;
        if(index<0||index>=this.getLength()) return null;
        Node node =this.getHead();
        int counter=0;
        while(counter!=index){
            node=node.getNext();
            counter++;
        }
        return node;
    }
    public boolean set(int index, int value){
        if(this.get(index)!=null)
        {
            this.get(index).setValue(value);
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if(index<0||index>this.getLength()) return false;
        if(index==0) {
            this.prepend(value);
            return true;
        }
        if(index==this.getLength()){
            this.append(value);
            return true;
        }
        Node previousNode=this.get(index-1);
        if(previousNode!=null){
            Node tempNode=new Node(value);
            tempNode.setNext(previousNode.getNext());
            previousNode.setNext(tempNode);
            this.length++;
            return true;
        }
        return false;
    }
    public Node remove(int index){
        if(index<0||index>=this.getLength()) return null;
        if(index==0) {
            return this.removeFirst();
        }
        if(index==this.getLength()-1){
            return this.removeLast();
        }
        Node previousNode=this.get(index-1);
        if(previousNode!=null){
            Node removedNode=previousNode.getNext();
            previousNode.setNext(removedNode.getNext());
            removedNode.setNext(null);
            this.length--;
           return removedNode;
        }
        return null;
    }
    public void reverse(){
        Node temp=this.getHead();
        this.head=this.getTail();
        this.tail=temp;
        Node after=temp.getNext();
        Node before=null;
        for (int i = 0; i < this.getLength(); i++) {
            after=temp.getNext();
            temp.next=before;
            before =temp;
            temp=after;
        }
    }
    @ToString
    class Node{

     @Getter @Setter
     private int value ;
     @Getter @Setter
     private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
