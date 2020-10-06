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

        while(temp.next != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("List Traversal successful");

    }

    public static LinkedList insertAtHead(LinkedList llOb , int val){
        LinkedList tempList = llOb;
        Node tempNode = new Node(val);
        if (tempList.head == null){
            tempList.head = tempNode;
            return tempList;
        }
        tempNode.next = tempList.head.next;
        tempList.head = tempNode;

        return tempList;
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


}//end of class













