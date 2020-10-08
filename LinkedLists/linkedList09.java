package LinkedLists;

import java.util.Scanner;

public class linkedList09 {

    public static int countOccurences(LinkedList llObject, int valToCount){

        Scanner scan = new Scanner(System.in);

        int count = 0;
        LinkedList.Node temp = llObject.head;
    
        while(temp!= null){
                if (temp.data == valToCount) count++;
                temp = temp.next;
                }
            scan.close();
            System.out.println(valToCount + " occures "+ count + " times in the list.");
            return count;
    
    }

    public static int countOccurencesRec(LinkedList.Node temp, int valToCount){
        
        //base condition
        if (temp == null){
            
            return 0;
        }
        if (temp.data == valToCount) 
        return 1 + (countOccurencesRec(temp.next, valToCount));

        return countOccurencesRec(temp.next, valToCount);


    }
    public static void main(String ar []){

        LinkedList llObject = new LinkedList();

        //Enter values in the linked list
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of list");
        int lengthOfList = scan.nextInt();

        System.out.println("Enter linked list node values :");
        for (int i=0; i<lengthOfList; i++){
            int val = scan.nextInt();
            llObject.insertAtEnd(val);
        }

        System.out.println("\nThe list is as follows");
        llObject.printList();

        System.out.println("\nEnter value to count occurences");
        int valToCount = scan.nextInt();

        int result = countOccurences(llObject, valToCount);
        System.out.println("Result is : " + result);
        scan.close();

        System.out.println("\nRecursive Solution");
        int resultRec = countOccurencesRec(llObject.head, valToCount);
        System.out.println("Recursive result is : "+ resultRec);

        System.out.println("Program completed");
    }
}