package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    class Node{
        Node left;
        Node right;
        int value;
        Node(int value){
            this.value=value;
        }
    }
    public boolean insert(int value){
        Node toBeInserted=new Node(value);
        if(root==null) {
            root=toBeInserted;
            return true;
        }
        Node temp=root;
        while(temp!=null){
            if(temp.value==toBeInserted.value) return false;
            if(toBeInserted.value<temp.value){ //left tree
                if(temp.left==null)
                {
                    temp.left=toBeInserted;
                    return true;
                }
                else temp=temp.left;
            } else { //right tree
                if(temp.right==null)
                {
                    temp.right=toBeInserted;
                    return true;
                }
                else temp=temp.right;
            }
        }
        return false;
    }

    public boolean contains(int value){
        if(root!=null&&root.value==value) return true;
        Node temp=root;
        while(temp!=null){
            if(temp.value==value) return true;
            if(value<temp.value){
                if(temp.left!=null&&temp.left.value==value)
                    return true;
                else temp=temp.left;
            }else{
                if(temp.right!=null&&temp.right.value==value)
                    return true;
                else temp=temp.right;
            }
        }
        return false;
    }

    public void printTree(){
        if(root!=null)
            System.out.println(root.value);
        Node temp=root;


    }
    public boolean rContains(int value){
        return rContains(root,value);
    }

    private boolean rContains(Node currentNode, int value) {
        if(currentNode==null) return false;
        if(currentNode.value==value) return true;
        if(value<currentNode.value){
            return rContains(currentNode.left,value);
        }else {
            return rContains(currentNode.right,value);
        }
    }

    public void rInsert(int value){
        if(root==null) root=new Node(value);
        rInsert(root,value);
    }

    private Node rInsert(Node currentNode, int value) {
        if(currentNode==null) return new Node(value);
        if(value<currentNode.value){
            currentNode.left=rInsert(currentNode.left,value);
        }else if (value>currentNode.value) {
            currentNode.right=rInsert(currentNode.right,value);
        }
        return currentNode;
    }
    public int minValue(Node currentNode){
        if(currentNode.left==null) return currentNode.value;
        return minValue(currentNode.left);
    }
    public void deleteNode(int value){
        deleteNode(root,value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if(currentNode==null) return null;
        if(value<currentNode.value){
            currentNode.left=deleteNode(currentNode.left,value);
        }else if(value>currentNode.value){
            currentNode.right=deleteNode(currentNode.right,value);
        }else{
                if(currentNode.left==null&&currentNode.right==null)
                    return null;
                else if(currentNode.left!=null&&currentNode.right==null)
                    return currentNode.left;
                else if(currentNode.left==null&&currentNode.right!=null) {
                    return currentNode.right;
                }
               else {
                    int minValue = minValue(currentNode);
                    currentNode.value = minValue;
//                    while (currentNode.left!=null&&currentNode.left.value != minValue) {
//                        currentNode=currentNode.left;
//                    }
//                    currentNode.left=null;
                    currentNode.right=deleteNode(currentNode.right,minValue);
                }
        }
        return currentNode;
    }
    public void sortedArrayToBST(int[] nums) {
        this.root = sortedArrayToBST(nums, 0, nums.length - 1);
    }
    private Node sortedArrayToBST(int[] nums, int left, int right){
        if(left>right) return null;
        int midIndex=left+(right-left)/2;
        Node currentNode=new Node(nums[midIndex]);
        currentNode.left=sortedArrayToBST(nums,left,midIndex-1);
        currentNode.right=sortedArrayToBST(nums,midIndex+1,right);
        return currentNode;
    }
    public void invert() {
        root = invertTree(root);
    }

    private Node invertTree(Node currentNode) {
        if(currentNode==null) return null;
        Node temp=currentNode.right;
        currentNode.right=invertTree(currentNode.left);
        currentNode.left=invertTree(temp);
        return currentNode;
    }

    public ArrayList<Integer> BFS(){
        ArrayList<Integer> output=null;
        if(root==null) return output;
        output=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node removed=queue.remove();
            output.add(removed.value);
            if(removed.left!=null) queue.add(removed.left);
            if(removed.right!=null) queue.add(removed.right);
        }

        return output;
    }
    public ArrayList<Integer> DFSPreOrder(){
        if(root==null) return null;
        ArrayList<Integer> sequenceList=new ArrayList<>();
        class Traverse{
            Traverse (Node currentNode){
                sequenceList.add(currentNode.value);
                if(currentNode.left!=null) new Traverse(currentNode.left);
                if(currentNode.right!=null) new Traverse(currentNode.right);
            }
        }
        new Traverse(root);
        return sequenceList;
    }
    public ArrayList<Integer> DFSPostOrder(){
        if(root==null) return null;
        ArrayList<Integer> sequenceList=new ArrayList<>();
        class Traverse{
             Traverse(Node currentNode){
                if(currentNode.left!=null) new Traverse(currentNode.left);
                if(currentNode.right!=null) new Traverse(currentNode.right);
                sequenceList.add(currentNode.value);
            }
        }
        new Traverse(root);
        return sequenceList;
    }
}
