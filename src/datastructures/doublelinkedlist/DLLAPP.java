package datastructures.doublelinkedlist;

public class DLLAPP {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList= new DoublyLinkedList(7);
        doublyLinkedList.append(4);
        doublyLinkedList.append(3);
        System.out.println(doublyLinkedList.insert(1,8));
        doublyLinkedList.append(12);
        doublyLinkedList.append(89);
        doublyLinkedList.printList();
        doublyLinkedList.swapPairs();
        System.out.println("isPailindrome"+doublyLinkedList.isPalindrome());
        doublyLinkedList.printList();
        doublyLinkedList.reverse();
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
