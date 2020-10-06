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

    public void deleteKey(int key){

        Node temp = head;
        Node prev = null;
        if (head.data == key){
            head = head.next;
            return;
        }

        while(temp!= null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)return;
        prev.next = temp.next;
    }

    public void deleteFromPosition(int position){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        else if (position <0 ){
            System.out.println("Enter valid position");
            return;
        }
        else if (position == 0 && head!= null){
            head = head.next;
        }

        else{
            Node temp = head;
            int i = 0;
            while(temp.next != null && i<position-1){
                temp = temp.next;
                i++;
            }

            if (temp.next == null){
                System.out.println("\nPosition value is large");
                return;
            }
            temp.next = temp.next.next;
            System.out.println("\nValid position deleted");
        }
        


    }

}//end of class













