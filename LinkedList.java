// Linked List in java

public class LinkedList{

    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
        }
    }

    public void printList(){

        Node temp = this.head;

        while(temp.next != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();

    }


}//end of class