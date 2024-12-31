package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    List<Integer> heap;

    public MinHeap(){
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
        if(heap.size()==1) return;
        int child=heap.size()-1;
        while(child>0&&heap.get(child)<heap.get(parent(child))){
            swap(child,parent(child));
            child=parent(child);
        }
    }
    public Integer remove(){
        Integer removed=null;
        if(heap.size()==0) return removed;
        if(heap.size()==1) return heap.remove(0);
        int lastIndex=heap.size()-1;
        swap(0,lastIndex);
        removed=heap.remove(lastIndex);
        sinkDown(0);
        return removed;
    }
    private void sinkDown(int index){
        int minIndex=index;
        while (true){
            int leftIndex=leftChild(index);
            int rightIndex=rightChild(index);
            if(leftIndex<heap.size()&&heap.get(leftIndex)<heap.get(minIndex)){
                minIndex=leftIndex;
            }
            if(rightIndex<heap.size()&&heap.get(rightIndex)<heap.get(minIndex)){
                minIndex=rightIndex;
            }
            if(index!=minIndex){
                swap(index,minIndex);
                index=minIndex;
            }else {
                return;
            }
        }
    }
}
