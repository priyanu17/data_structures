package Queues;

public class queue01 {
    public static void main(String arh [] ){
        System.out.println("\nCreate and implement a queue using array\n");
        
        queueStatic queueObject = new queueStatic(20);

        System.out.println("Front and rear when queue is empty");
        System.out.println("Front is : " + queueObject.front());
        System.out.println("Rear is : " + queueObject.rear());
        //insert elements into queue
        queueObject.enqueue(11);
        queueObject.enqueue(22);
        queueObject.enqueue(33);
        queueObject.enqueue(44);
        queueObject.enqueue(55);

        System.out.println("Front and rear after inserting 5 elements");
        System.out.println("Front is : " + queueObject.front());
        System.out.println("Rear is : " + queueObject.rear());

        //delete elements from queue
        queueObject.dequeue();
        queueObject.dequeue();
        System.out.println("Front and rear after deleting two elements");
        System.out.println("Front is : " + queueObject.front());
        System.out.println("Rear is : " + queueObject.rear());

    }
}
