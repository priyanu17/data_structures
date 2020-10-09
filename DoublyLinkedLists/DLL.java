package DoublyLinkedLists;

public class DLL {
    
    Node head;

    public static class Node{
        int data;
        Node prev ;
        Node next ;
        Node(int val) {
            this.data = val;
            this.prev = null;
            this.next = null;
        }
    }

    public void printDll(){
        Node temp = this.head;

        while(temp!= null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("\nDll Traversal Successful");
    }

    public void insertAtHead(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;
    }   
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
    }

    public void insertAfterNode(Node prevNode, int val){
        //prevNode is invalid
        if (prevNode  == null){
            System.out.println("\nPrevious node cannot be empty : No node inserted");
            return;
        }
        Node newNode = new Node(val);

        //only one node in dll
        if(head.next == null){
            head.next = newNode;
            newNode.prev = head;
            return;
        }

        //between two nodes
        Node nextNode = prevNode.next;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = nextNode;
        nextNode.prev = newNode;

    }   
    public void insertBeforeNode(Node nextNode, int val){
        //nextNode is invalid
        if (nextNode == null){
            System.out.println("\nNext node cannot be empty : No node inserted");
            return;
        }
        Node newNode = new Node(val);

        //only one node in dll
        if (head.next == null){
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prevNode = nextNode.prev;

        //between two nodes
        nextNode.prev = newNode;
        newNode.next = nextNode;
        newNode.prev = prevNode;
        prevNode.next = newNode;

    }

    public void deleteFromHead(){
        if(head == null){
            System.out.println("\nDll is empty : No node deleted");
            return;
        } 
        if(head.next == null){
            head = null;
            return;
        }     
        
        Node nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
    }

    public void deleteFromEnd(){
        if(head == null){
            System.out.println("\nDll is empty : No node deleted");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        } 

        Node temp = head;
        while(temp.next.next!= null) temp = temp.next;

        temp.next = null;

    }

    public void deleteBeforeNode(Node nextNode){
        if (nextNode == null || nextNode.prev ==  null){
            System.out.println("\nPrevious node does not exist to be deleted");
            return;
        }
        if(nextNode.prev == head){
            nextNode.prev = null;
            head = nextNode;
            return;
        }

            Node prevNode = nextNode.prev.prev;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
    }

    public void deleteAfterNode(Node prevNode){
        if (prevNode == null || prevNode.next == null){
            System.out.println("\nNext node does not exist to be deleted");
            return;
        }
        
        if(prevNode.next.next == null){
            prevNode.next = null;
            return;
        }
        Node nextNode = prevNode.next.next;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }
    public void traverseInReverseOrder(){
        Node temp = head;

        while(temp.next!= null) temp = temp.next;
        System.out.println("Dll traverse in reverse order");
        while(temp!= null){
            System.out.print(temp.data + "  ");
            temp = temp.prev;
        }
        System.out.println();
    }

    //reversing by swapping pointers
    public void reverseDll(){
        if (head == null || head.next == null) return;
        Node current = this.head;
        Node prevNode = null;
        while(current!= null){
            prevNode = current.prev;
            current.prev = current.next;
            current.next = prevNode;
            current = current.prev;
        }
        head = prevNode.prev; 
    }

    
}//end of class








