package Queues;

public class queue04 {
    public static void main(String args [] ){

        System.out.println("\nTraverse a dynamic queue \n");

        queueDynamic queueObject = new queueDynamic();

        //insert elements into queue
        queueObject.enQueue(11);
        queueObject.enQueue(22);
        queueObject.enQueue(33);
        queueObject.enQueue(44);
        queueObject.enQueue(55);

        System.out.println("After inserting 5 elements");
        queueObject.printQueue();

        //delete elements from queue
        queueObject.deQueue();
        queueObject.deQueue();

        System.out.println("After deleting 2 elements");
        queueObject.printQueue();
        
        System.out.println("After performing more insertions");
        queueObject.enQueue(66);
        queueObject.enQueue(77);
        queueObject.enQueue(88);
        queueObject.enQueue(99);
        queueObject.enQueue(100);

        queueObject.printQueue();
    }
}
