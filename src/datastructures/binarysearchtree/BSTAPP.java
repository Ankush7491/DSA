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
        binarySearchTree.rInsert(7);
        System.out.println(binarySearchTree.BFS());
        System.out.println(binarySearchTree.DFSPreOrder());
        System.out.println(binarySearchTree.DFSPostOrder());
        binarySearchTree.printTree();
        System.out.println(binarySearchTree.contains(100));
        System.out.println(binarySearchTree.contains(67));
        System.out.println(binarySearchTree.minValue(binarySearchTree.root));
        binarySearchTree.deleteNode(7);
        System.out.println(binarySearchTree.minValue(binarySearchTree.root));
    }
}
