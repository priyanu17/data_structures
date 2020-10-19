package Queues;

public class queue03 {
    public static void main(String args [] ){

        System.out.println("\nCreate and implement a dynamic queue using linked lists\n");

        queueDynamic queueObject = new queueDynamic();

        queueObject.enQueue(11);
        queueObject.enQueue(22);
        queueObject.enQueue(33);
        queueObject.enQueue(44);
        queueObject.enQueue(55);

        System.out.println("Front and rear after inserting 5 elements");
        System.out.println("Front is : " + queueObject.front());
        System.out.println("Rear is : " + queueObject.rear());

        //delete elements from queue
        queueObject.deQueue();
        queueObject.deQueue();
        System.out.println("Front and rear after deleting two elements");
        System.out.println("Front is : " + queueObject.front());
        System.out.println("Rear is : " + queueObject.rear());
    }
}
