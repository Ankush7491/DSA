package datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {this.val=val;}
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
    public ListNode findMiddleNode(ListNode head){
        ListNode middleNode=null;
        int length=0;
        if(head==null) return null;
        if(head.next==null) return head;
        middleNode=head;
        ListNode temp=middleNode.next;
        ListNode fasterNode=null;
        fasterNode=temp.next;
        if(fasterNode!=null) {
            while (fasterNode.next != null) {
                temp=fasterNode.next;
                fasterNode=temp.next;
                middleNode=middleNode.next;
                if(fasterNode==null)
                    return middleNode.next;
            }
        }
        return middleNode.next;
    }
    public boolean hasCycle(ListNode head){
        if(head==null) return false;
        if(head.next==null) return false;
        ListNode slowNode=head;
        ListNode temp= head.next;
        ListNode fasterNode=temp.next;
        if(fasterNode!=null){
            while(fasterNode.next!=null){
                if(fasterNode.next==slowNode)
                    return true;
                temp=fasterNode.next;
                fasterNode=temp.next;
                if(fasterNode==null)
                    return false;
                slowNode=slowNode.next;

            }
        }

        return false;
    }
    public void removeDuplicates(ListNode head){
        if(head!=null) {
            ListNode currentNode = head;
            ListNode beforeNode =null;
            Set hashSet = new HashSet<Integer>();
            while (currentNode != null) {
                if(!hashSet.contains(currentNode.val))
                {
                    hashSet.add(currentNode.val );
                    beforeNode=currentNode;

                }
                else{
                    beforeNode.next=currentNode.next;
                    //  Node temp=currentNode.next;
                    //    currentNode.next=null;
                    //   currentNode=temp;
                   // length--;
                }

                currentNode=currentNode.next;
            }
        }
    }
    public int binaryToDecimal(ListNode head){
        int sum=0;
        if(head==null) return sum;
        ListNode currentNode=head;
        while(currentNode!=null){
            sum=2*sum+currentNode.val;
            currentNode=currentNode.next;
        }
        return sum;
    }
    public ListNode partitionList(int x,ListNode head){
        if(head==null) return null;
        // Step 2: Create two dummy nodes.
        // These dummy nodes act as placeholders
        // to simplify list manipulation.
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        // Step 3: Initialize pointers for new lists.
        // 'prev1' and 'prev2' will track the end nodes of
        // the two lists that are being created.
        ListNode prev1 = dummy1;
        ListNode prev2 = dummy2;

        // Step 4: Start with the head of the original list.
        ListNode current = head;

        // Step 5: Iterate through the original list.
        while (current != null) {

            // Step 6: Compare current node val with 'x'.
            // Nodes are partitioned based on their val
            // being less than or greater than/equal to 'x'.

            // Step 6.1: If val is less than 'x',
            // add node to the first list.
            if (current.val < x) {
                prev1.next = current;  // Link node to the end of the first list.
                prev1 = current;       // Update the end pointer of the first list.
            } else {
                // Step 6.2: If val is greater or equal,
                // add node to the second list.
                prev2.next = current;  // Link node to the end of the second list.
                prev2 = current;       // Update the end pointer of the second list.
            }

            // Move to the next node in the original list.
            current = current.next;
        }

        // Step 7: Terminate the second list.
        // This prevents cycles in the list.
        prev2.next = null;

        // Step 8: Connect the two lists.
        // The first list is followed by the second list.
        prev1.next = dummy2.next;

        // Step 9: Update the head of the original list.
        // The head now points to the start of the first list.
        head = dummy1.next;
        return head;
    }
}
