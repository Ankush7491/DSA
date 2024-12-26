package datastructures.heap;

public class HEAPAPP {
    public static void main(String[] args) {
        Heap heap=new Heap();
        heap.insert(99);
        heap.insert(68);
        heap.insert(52);
        heap.insert(72);
        heap.insert(100);
        heap.insert(65);
        System.out.println(heap.getHeap());
    }
}
