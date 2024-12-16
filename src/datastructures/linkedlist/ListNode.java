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
        if(head!=null){

            ListNode currentNode=head;
            ListNode leftHead=new ListNode(0);
            ListNode rightHead=new ListNode(0);
            ListNode leftChain=leftHead;
            ListNode rightChain=rightHead;
            ListNode equalHead=new ListNode(0);
            ListNode equalNode=equalHead;
            while(currentNode!=null){
                if(currentNode.val<x){
                    leftChain.next=currentNode;
                    leftChain=leftChain.next;
                } else if (currentNode.val==x) {
                    equalNode.next=currentNode;
                    equalNode=equalNode.next;
                } else if (currentNode.val>x) {
                    rightChain.next=currentNode;
                    rightChain=rightChain.next;
                }
                currentNode=currentNode.next;
            }
            rightChain.next=null;
            equalNode.next=rightHead.next;
            leftChain.next=equalHead.next;

            head=leftHead.next;
        }
        return head;
    }
}
