package datastructures.linkedlist;

public class LLAPP {

    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList(1);
//        linkedList.append(1);
//        linkedList.prepend(1);
//        linkedList.append(0);
//        System.out.println(linkedList.binaryToDecimal());
        linkedList.append(790);
        linkedList.append(90);
        linkedList.prepend(40);
        linkedList.prepend(549);
        System.out.println("before sort");linkedList.printList();
        linkedList.selectionSort();
        linkedList.printList();
        System.out.println("before partition");linkedList.printList();
        linkedList.partitionList(1);
        System.out.println("after partition");
        linkedList.printList();
        System.out.println("after partition end");
        linkedList.removeDuplicates();
        linkedList.printList();
        System.out.println(linkedList.findKthFromEnd(2));
        System.out.println("middlenode"+linkedList.findMiddleNode());
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
