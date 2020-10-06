
import java.util.Scanner;

public class linkedList6 {
    public static void main(String ar [] ){
        System.out.println("\n Find data at the nth node in a linked list");

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
        System.out.println("Enter node value");
        int nthNodeItr = scan.nextInt();   
        int nodeValueItr = llObject.FindNthNodeItr(nthNodeItr);
        System.out.println("Nth node value (Iterative) is : " + nodeValueItr);
        

        System.out.println("Enter node value");
        int nthNodeRec = scan.nextInt();   
        int nodeValueRec = llObject.FindNthNodeRec(llObject.head, nthNodeRec);
        System.out.println("Nth node value (Recursive) is : " + nodeValueRec);

        scan.close();
    }   
}
