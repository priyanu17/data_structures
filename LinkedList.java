public class LinkedList{
    Node head;
    public static class Node{

        int nodeData;
        Node nextNode;

        Node(int d){
            this.nodeData = d;
            this.nextNode = null;
        }

    }

    public void printList(){
        Node n = head;
        while(n!= null){
            System.out.print( n.nodeData + "  ");
            n = n.nextNode;
        }
        
        System.out.println("\nLinked list traversal successful");
    }

    
    public void insertAtHead(int data){

        Node newNode = new Node(data);
        newNode.nextNode = head;
        this.head = newNode;
}

    public void insertInMiddle(Node prevNode , int data){

        Node newNode = new Node(data);
        newNode.nextNode = prevNode.nextNode;
        prevNode.nextNode = newNode;

    }

    public void insertAtEnd(int data){

        Node newNode = new Node(data);
        Node n = this.head;
        while(n.nextNode!= null){
            n = n.nextNode;
        }
        n.nextNode = newNode;

    }

}

