package datastructures.binarysearchtree;

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
}
