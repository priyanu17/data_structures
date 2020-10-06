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

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("List Traversal successful");

    }

    public void insertAtHead( int val){
        Node tempNode = new Node(val);
        if (head == null){
            head = tempNode;
        }
        tempNode.next = head;
        head = tempNode;

    }

    public void insertInMiddle(Node prevNode, int val){
        if (prevNode == null){
            System.out.println("Previous Node dosen't exist");
        }
        Node tempNode = new Node(val);
        tempNode.next = prevNode.next;
        prevNode.next = tempNode;

    }

    public void insertAtEnd(int val){
        Node tempNode = new Node(val);
        tempNode.next = null;

        if (this.head == null){
            this.head = tempNode;
            return;
        }
        
        Node n = this.head;
        while(n.next != null){
            n = n.next;
        }
        n.next = tempNode;

    }

    public void deleteFromHead(){
        if (head!= null){
            head = head.next;
        }
    }
    public void deleteAfterNode(Node prev){
        if(prev!= null)
        prev.next = prev.next.next;
    }
    public void deleteFromEnd(){
        Node temp = head;
        Node prev = null;
        while(temp.next!= null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }


}//end of class













