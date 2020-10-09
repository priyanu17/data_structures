package LinkedLists;
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

        if (head == null){
            System.out.println("List is empty");
        }
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

    public void deleteList(){
        head = null;
    }

    public static int findLengthIterative(LinkedList ll){
        int count = 0;
        Node temp = ll.head;

        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int findLengthRecursive(Node temp){
        if (temp == null){
            return 0;
        }

        return (1 + (findLengthRecursive(temp.next)));
    }

    public boolean searchValueItr(int value){
        Node temp = head;

        while(temp!= null){
            if (temp.data == value){
                System.out.println("\nValue exists in list");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("\nValue does not exist in list");
        return false;
    }

    public boolean searchValueRec(Node n , int value){
        Node temp = n;
        if (temp == null){
            System.out.println("\nValue does not exist in list");
            return false;
        }

        if (temp.data == value){
            System.out.println("\nValue exists in list");
            return true;
        }
        return searchValueRec(temp.next, value);
    }

    public int FindNthNodeItr(int n){
        Node temp = head;

        while(temp != null && n>0){
            temp = temp.next;
            n--;
        }

        if (temp == null){
            System.out.println("Data does not exist in list");
            return 0;
        }
        return temp.data;
    }

    public int FindNthNodeRec(Node node, int n){
        Node temp = node;
        int count = 0;
        if (temp == null){
            return -1;
        }
        if (n==count){
            return temp.data;
        }

        return FindNthNodeRec(temp.next, n-1);
    }   

    public Node NthNodeFromEnd(int position){
        Node ref, ans;
        ref  = this.head;
        ans = this.head;
        if (position> 0){
            int i=1;
            while(i<position && ref != null){
                ref = ref.next;
                i++;
            }
            if (ref ==null){
                System.out.println("Position value is large than array length");
            }
            else{
                while(ref.next!= null ){
                    ref = ref.next;
                    ans = ans.next;
                }
            }
        }
        else{
            System.out.println("Invalid position entered");
        }
        return ans;
    }

    public static LinkedList reverseList(LinkedList llObject){

        Node previous, current, successor;
        previous = successor = null;
        current = llObject.head;

        while(current!= null){
            successor = current.next;
            current.next = previous;
            previous = current;
            current = successor;
        }
        llObject.head = previous;

        return llObject;
    }

    public void printListRec(Node node){
        
        //base condition
        if(node==null)
        {
            System.out.println("\nList Traversal using recursion successful");
            return;
        }
        System.out.print(node.data + "  ");
        printListRec(node.next);
    }

    public void printReverseListUsingRecursion(Node node){
        //base condition
        if(node == null){
            System.out.println("\nReverse list print successful");
            return;
        }
        printReverseListUsingRecursion(node.next);
        System.out.print(node.data + "  ");
    }

    public void reverseListUsingRecursion(Node previous, Node current, Node successor){

        if(current == null && successor == null){
            head = previous;
            return;
        }

        successor = current.next;
        current.next = previous;
        previous = current;
        current = successor;
        reverseListUsingRecursion( previous, current, successor);

    }
    public void reverseListUsingRecOneVariable(Node node){
        if (node.next== null){
            head = node;
            return;
        }
        reverseListUsingRecOneVariable(node.next);
        node.next.next = node;
        node.next = null; 
    }

    public void swapKthFrontWithEnd(int k){
        Node frontNode, endNode;
        Node prevFront, prevEnd;
        
        int l = findLengthIterative(this);

        if(k<1 || k>l) {
            System.out.println("Invalid value of K");
            return;
        }

        if(( (2*k)- 1) == l) return;

        int i, j;
        i= j = 1;

        frontNode = endNode = head;
        prevFront = prevEnd = null;
        while(i<k){
            prevFront = frontNode;
            frontNode = frontNode.next;
            i++;
        }

        while(j< (l-k+1)){
            prevEnd = endNode;
            endNode = endNode.next;
            j++;
        }

        //actual swapping
        if(prevFront!= null) prevFront.next = endNode;
        if(prevEnd!= null)prevEnd.next = frontNode;

        Node temp = frontNode.next;
        frontNode.next = endNode.next;
        endNode.next = temp;

        if(k == 1) head = endNode;
        if(k == l) head = frontNode;
    }
}//end of class












