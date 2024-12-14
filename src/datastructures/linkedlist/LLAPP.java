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
        linkedList.insert(2,92);
        linkedList.insert(1,789);
        linkedList.printList();
        linkedList.remove(1);
        linkedList.reverse();
        linkedList.printList();

    }
}
