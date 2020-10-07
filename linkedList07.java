import java.util.Scanner;

public class linkedList07 {
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
        if (position> 0){
            int i=1;
            while(i<position && ref != null){
                ref = ref.next;
                i++;
            }
            if (ref ==null){
                System.out.println("Position value is large than array length");
            }
            else{
                while(ref.next!= null ){
                    ref = ref.next;
                    ans = ans.next;
                }
                System.out.println("\nPosition "+ position + " from the end of the list is : "+ ans.data);
            }
        }
        else{
            System.out.println("Invalid position entered");
        }

        System.out.println("\nProgram completed");


    }
}
