package datastructures.hashtable;

public class HashTable {
    private int size=7;
    private Node[]  dataMap;

    public HashTable(){
        dataMap=new Node[size];
    }
    class Node{
        String key;
        int value;
        Node next;
        Node(String key, int value){
            this.key=key;
            this.value=value;
        }
    }
    public void printTable(){
        if(dataMap!=null){
            int index=0;
            for(Node indexNode:dataMap){
                Node firstNode=indexNode;
                System.out.println("["+index+"]:");
                while(firstNode!=null){
                    System.out.print(firstNode.key+"  ="+firstNode.value+" |");
                    firstNode= firstNode.next;
                }
                index++;
            }
        }
    }
}
