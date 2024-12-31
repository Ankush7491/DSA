package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    List<Integer> heap;

    public Heap(){
        heap=new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }
    private int leftChild(int index){
        return 2*index+1;
    }
    private int rightChild(int index){
        return 2*index+2;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private void swap(int index1,int index2){
        int temp=heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }
    public void insert(int value){
        heap.add(value);
        int childIndex=heap.size()-1;
        int parentIndex=parent(childIndex);
        while(childIndex>0&&heap.get(parentIndex)<heap.get(childIndex)){
            swap(parentIndex,childIndex);
            childIndex=parentIndex;
            parentIndex=parent(childIndex);
        }
    }
    public int remove(){
        Integer removed=null;
        if(heap.isEmpty()) return removed;
        if(heap.size()==1){
            removed=heap.remove(0);
            return removed;
        }
        int lastIndex=heap.size()-1;
        swap(0,lastIndex);
        removed=heap.remove(lastIndex);
        sinkDown(0);
        return removed;
    }

    private void sinkDown(int index) {
        int maxIndex=index;
        while(true){
            int leftIndex=leftChild(index);
            int righIndex=rightChild(index);
            if(leftIndex<heap.size()&&heap.get(leftIndex)>heap.get(maxIndex)){
                maxIndex=leftIndex;
            }
            if(righIndex<heap.size()&&heap.get(righIndex)>heap.get(maxIndex)){
                maxIndex=righIndex;
            }
            if(maxIndex!=index){
                swap(index,maxIndex);
                index=maxIndex;
            }else{
                return;
            }
        }
    }
}
