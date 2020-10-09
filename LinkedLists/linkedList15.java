package LinkedLists;

import java.util.Scanner;

public class linkedList15 {
    
    public static void main(String args [] ){


        System.out.println("\nSwap Kth node from front with Kth node from back in a Linked List\n");

        //create linked list object
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

        System.out.println("\nThe list elements");
        llObject.printList();

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Kth position to swap :");
        int Kthposition = scan.nextInt();
        llObject.swapKthFrontWithEnd(Kthposition);

        System.out.println("\nList after Swap is complete\n");
        llObject.printList();
        scan.close();

    }
}

