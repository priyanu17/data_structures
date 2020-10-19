package Queues;

public class queueDynamic {
    
    public static class queueNode{
        int data;
        queueNode next;

        queueNode(int val){
            this.data = val;
            this.next = null;
        }
    }

    queueNode front;
    queueNode rear;
    public boolean isEmpty(){
        return (this.front == null && this.rear == null) ;
    }

    public void enQueue(int val){
        queueNode newNode = new queueNode(val);

        if(this.rear == null) {
            this.rear = newNode;
            this.front = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int deQueue(){

        if(this.front == null ) return Integer.MIN_VALUE;

        int item = this.front.data;
        front = front.next;
        return item;
    }

    public void printQueue(){

        queueNode temp = front;
        System.out.println("Queue from front to rear -->");
        while( temp != rear.next) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }   
        System.out.println();
    }
}









