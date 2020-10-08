public class doublyLinkedList01 {
    public static void main(String ar []){


        //create a dll object
        DoublyLinkedList dllObject = new DoublyLinkedList();

        //create nodes of the dll
        DoublyLinkedList.Node n1 = new DoublyLinkedList.Node(11);
        DoublyLinkedList.Node n2 = new DoublyLinkedList.Node(22);
        DoublyLinkedList.Node n3 = new DoublyLinkedList.Node(33);
        DoublyLinkedList.Node n4 = new DoublyLinkedList.Node(44);
        DoublyLinkedList.Node n5 = new DoublyLinkedList.Node(55);
        DoublyLinkedList.Node n6 = new DoublyLinkedList.Node(66);
    

        //link head node
        dllObject.head = n1;

        //create next links
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        //create previous links
        n6.prev = n5;
        n5.prev = n4;
        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        dllObject.printDoublyLinkedList();
        
    }
}
