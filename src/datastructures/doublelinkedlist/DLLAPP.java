package datastructures.doublelinkedlist;

public class DLLAPP {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList= new DoublyLinkedList(7);
        doublyLinkedList.append(13);
        doublyLinkedList.append(56);
        System.out.println("removed Node"+doublyLinkedList.removeLast().value);
        doublyLinkedList.printList();
    }
}
