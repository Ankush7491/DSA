package dsa.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListProbAPP {

    @Test
    public void testCreateLinkedList(){
        int nodeValue=7;
        SingleLinkedList singleLinkedList=new SingleLinkedList(nodeValue);
        Assertions.assertEquals(nodeValue,singleLinkedList.head.value);
    }
    @Test
    public void testPrepend(){
        int toBeInsertedVal=8;
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(toBeInsertedVal);
        Assertions.assertEquals(toBeInsertedVal,singleLinkedList.head.value);
    }
    @Test
    public void testAppend(){
        int toBeInsertedVal=78;
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.append(toBeInsertedVal);
        Assertions.assertEquals(toBeInsertedVal,singleLinkedList.tail.value);
    }
    @Test
    public void testInsertAtLocation(){
        int toBeInserted=90;
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(79);
        singleLinkedList.append(80);
        singleLinkedList.insert(toBeInserted,1);
        Assertions.assertEquals(toBeInserted,singleLinkedList.head.next.value);
    }
    @Test
    public void testTraversal(){
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(79);
        singleLinkedList.append(80);
        singleLinkedList.insert(99,1);
        singleLinkedList.append(88);
        singleLinkedList.traverse();
    }
    @Test
    public void testSearchNode(){
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(79);
        singleLinkedList.append(80);
        singleLinkedList.insert(99,1);
        singleLinkedList.append(88);
        int searchValue=80;
        Assertions.assertEquals(true,singleLinkedList.search(searchValue));
        Assertions.assertEquals(false,singleLinkedList.search(990));
    }
    @Test
    public void testSearchNodeIndex(){
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(79);
        singleLinkedList.append(80);
        singleLinkedList.insert(99,1);
        singleLinkedList.append(88);
        int searchValue=80;
        singleLinkedList.traverse();
        Assertions.assertEquals(3,singleLinkedList.searchIndex(searchValue));
        Assertions.assertEquals(-1,singleLinkedList.searchIndex(990));
    }
    @Test
    public void testDeletNode(){
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(79);
        singleLinkedList.append(80);
        singleLinkedList.insert(99,1);
        singleLinkedList.append(88);
        singleLinkedList.traverse();
        int locationIndex=2;
        Assertions.assertEquals(true,singleLinkedList.delete(locationIndex));
        Assertions.assertEquals(false,singleLinkedList.delete(5));
        singleLinkedList.traverse();
    }
    @Test
    public void testDeleteAll(){
        SingleLinkedList singleLinkedList=new SingleLinkedList(7);
        singleLinkedList.prepend(79);
        singleLinkedList.append(80);
        singleLinkedList.insert(99,1);
        singleLinkedList.append(88);
        singleLinkedList.traverse();
        singleLinkedList.deleteEntireList();
        Assertions.assertEquals(null,singleLinkedList.head);
        singleLinkedList.traverse();
    }
}
