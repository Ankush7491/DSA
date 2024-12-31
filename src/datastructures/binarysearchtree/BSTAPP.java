package datastructures.binarysearchtree;

public class BSTAPP {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(67);
        binarySearchTree.insert(56);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(32);
        binarySearchTree.rInsert(788);
        binarySearchTree.printTree();
        System.out.println(binarySearchTree.contains(100));
        System.out.println(binarySearchTree.contains(67));
    }
}
