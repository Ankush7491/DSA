package datastructures.doublelinkedlist;

public class DLLAPP {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList= new DoublyLinkedList(7);
        doublyLinkedList.append(13);
        doublyLinkedList.append(56);
        System.out.println(doublyLinkedList.insert(1,4));
        doublyLinkedList.printList();
        doublyLinkedList.reverse();
        doublyLinkedList.printList();
        doublyLinkedList.swapFirstLast();
        System.out.println(doublyLinkedList.remove(1));
        doublyLinkedList.printList();
        System.out.println("removed Node"+doublyLinkedList.removeLast().value);
        doublyLinkedList.prepend(29);
        System.out.println("removed First Node"+doublyLinkedList.removeFirst().value);
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.get(1).value);
        System.out.println(doublyLinkedList.set(1,19));

    }
}
