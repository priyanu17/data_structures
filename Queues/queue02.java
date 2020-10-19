package Queues;

public class queue02 {
    public static void main(String args [] ){
        System.out.println("\nTraverse a static queue\n");

        queueStatic queueObject = new queueStatic(10);

        System.out.println("Maximum queue capacity is : " + queueObject.capacity);
        System.out.println("Size of queue : " + queueObject.size);

        //insert elements into queue
        queueObject.enqueue(11);
        queueObject.enqueue(22);
        queueObject.enqueue(33);
        queueObject.enqueue(44);
        queueObject.enqueue(55);

        System.out.println("After inserting 5 elements");
        queueObject.printQueue();
        System.out.println("Size of queue : " + queueObject.size);

        //delete elements from queue
        queueObject.dequeue();
        queueObject.dequeue();

        System.out.println("After deleting 2 elements");
        queueObject.printQueue();
        System.out.println("Size of queue : " + queueObject.size);
        
        System.out.println("After inserting beyond capacity");
        queueObject.enqueue(66);
        queueObject.enqueue(77);
        queueObject.enqueue(88);
        queueObject.enqueue(99);
        queueObject.enqueue(100);

        queueObject.printQueue();
        System.out.println("Size of queue : " + queueObject.size);
        System.out.println("Traversal successful after insertion beyond capacity");
    }
}
