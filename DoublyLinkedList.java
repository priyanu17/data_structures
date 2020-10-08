public class DoublyLinkedList{

    Node head;
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int val){
            this.data = val;
            this.prev = null;
            this.next = null;
        }
    }//end of Node class

    public void printDoublyLinkedList(){
        Node temp = this.head;

        while(temp!= null){
            System.out.print(temp.data+ "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Doubly linked list traversal successful");
    }
    
}//end of class