package Queues;

public class queueDynamic {
    
    queueNode front;
    queueNode rear;
    
    public static class queueNode{
        int data;
        queueNode next;

        queueNode(int val){
            this.data = val;
            this.next = null;
        }
    }

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

    public int front(){
        if(this.front == null) return Integer.MIN_VALUE;
        return front.data;
    }
    public int rear(){
        if (this.rear == null ) return Integer.MIN_VALUE;
        return rear.data;
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









