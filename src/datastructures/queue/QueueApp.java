package datastructures.queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue queue=new Queue(20);
        queue.enqueue(4);
        queue.enqueue(13);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
    }
}
