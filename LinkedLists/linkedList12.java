package LinkedLists;

public class linkedList12 {
    public static void main(String args []){
        System.out.println("\nPrint linked list in reverse order using recursion\n");

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

        System.out.println("List in true order");
        llObject.printList();
        //print in reverse order
        llObject.printReverseListUsingRecursion(llObject.head);
    }
}
