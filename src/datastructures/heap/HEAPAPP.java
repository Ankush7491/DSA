package datastructures.heap;

import java.util.HashSet;
import java.util.Set;

public class HEAPAPP {
    public static void main(String[] args) {
        MinHeap heap=new MinHeap();
        heap.insert(99);
        heap.insert(68);
        heap.insert(52);
        heap.insert(72);
        heap.insert(100);
        heap.insert(65);
        System.out.println(heap.getHeap());
    }
    public static int findKthSmallest(int[] nums,int k){
        int temp;
        if(nums.length==1) return nums[0];
        Heap heap=new Heap();
        Set<Integer> uniqueValues=new HashSet<>();
        for(int num:nums){
            heap.insert(num);
            if(heap.getHeap().size()>k)
                heap.remove();
        }
        temp=heap.remove();
       return temp;
    }
}
