
public class linkedList2 {

    public static void main(String args []){

        System.out.println("\nCreate a manual linked list");
        System.out.println("Traverse through the linked list");
        System.out.println("Insert at the head, in the middle and at the end");
        System.out.println("Display insertion results");

        //create the linkedlist object
        LinkedList theLinkedList = new LinkedList();

        //create the initial nodes
        LinkedList.Node first = new LinkedList.Node(11);
        LinkedList.Node second = new LinkedList.Node(22);
        LinkedList.Node third = new LinkedList.Node(33);
        LinkedList.Node fourth = new LinkedList.Node(44);
        LinkedList.Node fifth = new LinkedList.Node(55);

        //link the nodes
        theLinkedList.head = first;
        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;
        fourth.nextNode = fifth;

        System.out.println("\nDisplaying the initial list");
        theLinkedList.printList();

        //insert a 5 at head
        theLinkedList.insertAtHead(5);

        System.out.println("\nAfter insertion at head");
        theLinkedList.printList();

        //insert 25 at fourth position
        theLinkedList.insertInMiddle(fourth, 25);

        System.out.println("\nAfter insertion in middle");
        theLinkedList.printList();

        //insert 100 at the end
        theLinkedList.insertAtEnd(100);

        System.out.println("\nAfter insertion at end");
        theLinkedList.printList();
    }    
    
}//end of class with main


