package LinkedLists;

public class linkedList16 {

    public static LinkedList mergeLists(LinkedList ll1, LinkedList ll2){
        LinkedList llObj = new LinkedList();

        LinkedList.Node firstList = ll1.head;
        LinkedList.Node secondList = ll2.head;

        if(firstList.data < secondList.data){
            llObj.head = firstList;
            firstList = firstList.next;
        }
        else{
            llObj.head = secondList;
            secondList = secondList.next;
        }
        llObj.head.next = null;

        LinkedList.Node temp = llObj.head;
        while(firstList != null && secondList != null){
            llObj.printList();
            if(firstList.data < secondList.data ){
                temp.next = firstList;
                firstList = firstList.next;
            }
            else{
                temp.next = secondList;
                secondList = secondList.next;
            }
            temp.next.next = null;
            temp = temp.next;
        }   
        while(firstList!= null) {
            temp.next = firstList;
            firstList = firstList.next;
            temp.next.next = null;
            temp = temp.next;
        }

        while(secondList != null){
            temp.next = secondList;
            secondList = secondList.next;
            temp.next.next = null;
            temp = temp.next;
        }

        return llObj;
    }
    public static void main(String args [] ){
        System.out.println("\nMerge two sorted LL to generate a sorted LL\n");

        //create first list
        LinkedList ll1 = new LinkedList();

        ll1.insertAtEnd(1);
        ll1.insertAtEnd(3);
        ll1.insertAtEnd(5);
        ll1.insertAtEnd(7);

        LinkedList ll2 = new LinkedList();

        ll2.insertAtEnd(2);
        ll2.insertAtEnd(2);
        ll2.insertAtEnd(2);
        ll2.insertAtEnd(4);
        ll2.insertAtEnd(6);
        ll2.insertAtEnd(8);
        ll2.insertAtEnd(8);
        ll2.insertAtEnd(8);
        ll2.insertAtEnd(8);

        //display linked lists
        System.out.println("Display list 1");
        ll1.printList();
        System.out.println("Display list 2");
        ll2.printList();

        LinkedList mergeList = mergeLists(ll1, ll2);

        //display merged lists
        System.out.println("Display merged list");
        mergeList.printList();

    }
}
