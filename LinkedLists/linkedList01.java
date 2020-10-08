package LinkedLists;

public class linkedList01 {
    

    public static void main(String ar []){


        System.out.println("\nCreate a manual linked list in java");
        System.out.println("Traverse through the linked list\n");

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


        llObject.printList();






    }






}
