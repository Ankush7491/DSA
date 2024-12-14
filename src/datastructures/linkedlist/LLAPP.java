package datastructures.linkedlist;

public class LLAPP {

    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList(78);
        linkedList.append(90);
        linkedList.append(790);
        linkedList.prepend(74);
        System.out.println(linkedList.get(2));
        linkedList.printList();
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.get(1));
        linkedList.set(1,91);
        linkedList.printList();
    }
}
