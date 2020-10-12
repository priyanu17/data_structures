package Stacks;

import java.util.Scanner;

public class stack15 {
    public static void main(String args [] ){
        
        System.out.println("\ncheck if array is stack sortable\n");

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
        scan.close();

        System.out.println("\nDisplay array");
        for(int element : array){
            System.out.print(element + "  ");
        }
        System.out.println();

        boolean ans = true;

        for(i=1; i<array.length; i++){
            if(array[i-1] < array[i]){
                ans = false;
                break;
            }
        }

        System.out.print("\nIs array Stack sortable ?\nAnswer : "+ ans);
    }
}   
