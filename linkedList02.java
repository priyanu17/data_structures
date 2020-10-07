
public class linkedList02 {
    public static void main(String ar []){
        System.out.println("\nCreate a manual linked list in java");
        System.out.println("Traverse through the linked list");
        System.out.println("Insert at head, in the middle and in the end");

        //linked list object
        LinkedList llObject = new LinkedList();

        //create node objects
        LinkedList.Node first = new LinkedList.Node(11);
        LinkedList.Node second = new LinkedList.Node(22);
        LinkedList.Node third = new LinkedList.Node(33);
        LinkedList.Node fourth = new LinkedList.Node(44);
        LinkedList.Node fifth = new LinkedList.Node(55);
        LinkedList.Node sixth = new LinkedList.Node(66);

        //link all nodes
        llObject.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println("\nList before insertions");
        llObject.printList();

        //insert at head
        llObject.insertAtHead( 5);

        System.out.println("\nAfter insertion at head");
        llObject.printList();

        //insert in middle
        llObject.insertInMiddle(third, 37);

        System.out.println("\nAfter insertion in middle");
        llObject.printList();

        //insert at end
        llObject.insertAtEnd(500);

        System.out.println("\nAfter insertion at end");
        llObject.printList();

    }
}
