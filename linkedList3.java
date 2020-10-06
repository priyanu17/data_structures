import java.util.Scanner;

public class linkedList3 {
    public static void main(String ar []){


        System.out.println("\nCreate a manual link list");
        System.out.println("Delete nodes at head, in middle and in the end\n");

        LinkedList llObject = new LinkedList();

        //create nodes
        LinkedList.Node n1 = new LinkedList.Node(11);
        LinkedList.Node n2 = new LinkedList.Node(22);
        LinkedList.Node n3 = new LinkedList.Node(33);
        LinkedList.Node n4 = new LinkedList.Node(44);
        LinkedList.Node n5 = new LinkedList.Node(55);
        LinkedList.Node n6 = new LinkedList.Node(66);
        LinkedList.Node n7 = new LinkedList.Node(77);
        LinkedList.Node n8 = new LinkedList.Node(88);

        //link nodes
        llObject.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        System.out.println("\nBefore any deletions");
        llObject.printList();

        //delete node from head
        llObject.deleteFromHead();

        System.out.println("\nAfter deletion from head");
        llObject.printList();

        //delete node from middle
        llObject.deleteAfterNode(n4);

        System.out.println("\nAfter deletion from middle");
        llObject.printList();

        //delete node from end
        llObject.deleteFromEnd();

        System.out.println("\nAfter deletion from end");
        llObject.printList();

        //insert element to delete later
        System.out.println("\nInsert a key to delete");
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        llObject.insertInMiddle(n6, key);

        System.out.println("\nList after key is inserted");
        llObject.printList();

        //delete key
        llObject.deleteKey(key);

        System.out.println("\nList after key is deleted");
        llObject.printList();

        System.out.println("\nEnter position to delete");
        int position = scan.nextInt();
        scan.close();

        llObject.deleteFromPosition(position);

        System.out.println("\nAfter deleting given position");
        llObject.printList();

    }
}







