public class linkedList8 {

    public static int middleNode(LinkedList llObject){

        LinkedList.Node middle, last;

        middle = last = llObject.head;

        //counter 
        int counter = 1;
        while(last.next!= null && last.next.next!= null){
            last = last.next.next;
            middle = middle.next;
            counter++;
        }
        
        System.out.println("\nMiddle element node in the linked list is : "+ middle.data);
        System.out.println("Middle node position is : " + counter);
        return middle.data;
    }
    public static void main(String ar []){
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

        //code to find the middle element
        System.out.println("List with odd number of nodes");
        llObject.printList();

        int middleNode;

        middleNode = middleNode(llObject);
        System.out.println("Middle node is : " + middleNode);

        System.out.println("\nNow the list has even no of nodes");
        //list with even number of nodes
        llObject.insertAtEnd(100);
        llObject.insertAtEnd(110);
        llObject.insertAtEnd(120);
        llObject.printList();

        middleNode = middleNode(llObject);
        System.out.println("Middle node is : " + middleNode);

    }   
    
}
