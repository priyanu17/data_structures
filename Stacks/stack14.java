package Stacks;

import java.util.Scanner;

public class stack14 {
    public static void main(String ar [] ){

        System.out.println("\nSort an array using stack\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int lengthOfArray = scan.nextInt();

        //create array 
        int array [] = new int[lengthOfArray];
        System.out.println("Enter "+ lengthOfArray+ " elements of the array");

        int i ;
        i = 0;
        while( i<lengthOfArray){
            int value = scan.nextInt();
            array[i] = value;
            i++;
        }

        System.out.println("\nDisplay array before sorting");
        for(int element : array){
            System.out.print(element + "  ");
        }
        System.out.println();
        
        //create stack object
        StackDynamic stackObject = new StackDynamic();
        i = 0;
        while( i<lengthOfArray){
            stackObject.push(array[i]);
            i++;
        }

        //sort array using stack
        StackDynamic.sortStack(stackObject);

        i = 0;
        while( i<lengthOfArray){
            array[i] = stackObject.pop();
            i++;
        }

        System.out.println("\nDisplay array after sorting");
        for(int element : array){
            System.out.print(element + "  ");
        }
        System.out.println();
        scan.close();

    }   
}
