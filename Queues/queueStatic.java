package Queues;

public class queueStatic {

    int rear;
    int front;
    int size;// current number of elements in the queue
    int capacity ;//size of queue array
    int array [];
    queueStatic(int cap){

        this.capacity = cap;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        array = new int[this.capacity];

    }
    public boolean isFull(){
        return (this.size == this.capacity);
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public void enqueue(int item){
        if(this.isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        this.rear = (this.rear + 1)%this.capacity;
        array[rear] = item;
        this.size++;

    }

    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue underflow");
            return Integer.MIN_VALUE;
        }
        int itemToReturn = array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size--;
        return itemToReturn;
    }

    public int front(){
        if(this.isEmpty()) return Integer.MIN_VALUE;
        return this.array[this.front];
    }
    public int rear(){
        if(this.isEmpty()) return Integer.MIN_VALUE;
        return this.array[this.rear];
    }

    public void printQueue(){

        if(!this.isEmpty() && this.front < this.rear){
            System.out.println("Queue from front to rear -->");
            for(int i=front; i<=rear; i++) System.out.print(array[i] + "  ");
            System.out.println();
        }

        else if(!this.isEmpty() && this.front > this.rear){
            System.out.println("Queue from front to rear -->");
            for(int i=front; i<this.capacity; i++) System.out.print(array[i] + "  ");
            for(int i=0; i<=rear ; i++) System.out.print(array[i] + "  ");
        }
        else{
            System.out.println("Queue is Empty");
        }
    }
}








