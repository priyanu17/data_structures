package Stacks;

import java.util.Stack;

public class stack25 {

    public static int [] findNextGreaterElement(int ar [] ){
        Stack<Integer> sO = new Stack<Integer>();

        int resultArray [] = new int[ar.length];
        for(int i=(ar.length-1); i>=0; i--){
            while(!sO.isEmpty() && sO.peek() < ar[i]) sO.pop();

            if(sO.isEmpty()) resultArray[i] = -1;
            else 
            resultArray[i] = sO.peek();

            sO.push(ar[i]);
        }
        return resultArray;

    }
    public static void main(String srga [] ){

        System.out.println("\nFind the next greater element for each element in an array\n");

        int arr [] = { 11, 13, 21, 3 };

        int resultArray [] = findNextGreaterElement(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + "----> " + resultArray[i]);
        }
        System.out.println();
        int arr2 [] = { 4, 5, 2, 25 };

        int resultArray2 [] = findNextGreaterElement(arr2);

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i] + "----> " + resultArray2[i]);
        }
        System.out.println();

        int arr3 [] = { 13, 7, 6, 12 };

        int resultArray3 [] = findNextGreaterElement(arr3);

        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i] + "----> " + resultArray3[i]);
        }
        System.out.println();

    }   
}
