
class linkedList1 {

    public static void main(String mickey []){

        System.out.println("\nCreating a manual linked list with five nodes");
        System.out.println("Print all elements of the manual linked list\n");

        //initialize the linkedList
        LinkedList theLinkedList = new LinkedList();

        //create the nodes
        LinkedList.Node first = new LinkedList.Node(11);
        LinkedList.Node second = new LinkedList.Node(22);
        LinkedList.Node third = new LinkedList.Node(33);
        LinkedList.Node fourth = new LinkedList.Node(44);
        LinkedList.Node fifth = new LinkedList.Node(55);

        //link nodes
        theLinkedList.head = first;
        
        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;
        fourth.nextNode = fifth;

        //print the contents of linked list

        theLinkedList.printList();

    }
}

 