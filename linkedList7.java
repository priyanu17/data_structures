import java.util.Scanner;

public class linkedList7 {
    public static void main(String ar[]){
        //create a linked list

        LinkedList llObject = new LinkedList();

        llObject.insertAtEnd(11);
        llObject.insertAtEnd(22);
        llObject.insertAtEnd(33);
        llObject.insertAtEnd(44);
        llObject.insertAtEnd(55);
        llObject.insertAtEnd(66);
        llObject.insertAtEnd(77);
        llObject.insertAtEnd(88);
        llObject.insertAtEnd(99);
        llObject.insertAtEnd(100);

        llObject.printList();

        //using Double Pointers
        LinkedList.Node ref, ans ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter position from end of list");
        int position = scan.nextInt();
        scan.close();

        ref  = llObject.head;
        ans = llObject.head;

        for (int i=1; i<position; i++){
            ref = ref.next;
        }

        while(ref.next!= null){
            ref = ref.next;
            ans = ans.next;
        }


        System.out.println("\nPosition "+ position + " from the end of the list is : "+ ans.data);

        System.out.println("\nProgram completed");


    }
}
