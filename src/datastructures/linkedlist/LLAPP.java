package datastructures.linkedlist;

public class LLAPP {

    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList(78);
        System.out.println(linkedList.getHead());
        System.out.println(linkedList.getTail());
        linkedList.append(90);
        linkedList.append(790);
        System.out.println(linkedList.getTail());
        linkedList.printList();
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.getTail());
        linkedList.printList();
    }
}
