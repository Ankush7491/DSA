package datastructures.linkedlist;

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
}
