package datastructures.hashtable;

import java.util.ArrayList;

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
                    System.out.println(firstNode.key+"  ="+firstNode.value+" |");
                    firstNode= firstNode.next;
                }
                index++;
            }
        }
    }
    private int hash(String key){
        int hash=0;
        char[] keyChars=key.toCharArray();
        for(char keyChar:keyChars){
            int asciiValue=keyChar;
            hash=(hash+asciiValue*23)%dataMap.length;
        }
        return hash;
    }
    public void set(String key,int value){
        int hash=hash(key);
        Node toBeInserted=new Node(key,value);
        if(dataMap[hash]==null) dataMap[hash]=toBeInserted;
        else{
            Node temp=dataMap[hash];
            while(temp.next!=null) temp=temp.next;
            temp.next=toBeInserted;
        }
    }
    public int get(String key){
        int value=0;
        if(dataMap==null)return 0;
        Node indexNode=dataMap[hash(key)];
        if(indexNode==null) return 0;
        while(indexNode!=null){
            if(indexNode.key.equals(key)) return indexNode.value;
            indexNode=indexNode.next;
        }
        return value;
    }
    public ArrayList<String> keys(){
        ArrayList<String> allKeys=new ArrayList<>();
        for(Node indexNode:dataMap){
            while(indexNode!=null){
                allKeys.add(indexNode.key);
                indexNode=indexNode.next;
            }
        }
        return allKeys;
    }
}
