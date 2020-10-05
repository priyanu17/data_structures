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
        System.out.println("First Linked list address : " + head.nextNode);
        while(n!= null){
            System.out.println("Data in linked list : " + n.nodeData);
            System.out.println("Next Linked list address : " + n.nextNode);
            n = n.nextNode;
        }
        
        System.out.println("Linked list traversal successful");
    }

    
    public void insertAtHead(int data){

        Node newNode = new Node(data);
        newNode.nextNode = head;
        this.head = newNode;
}


}

