package Stacks;

import java.util.Stack;

public class stack25{

    public static int []  findNextGreaterElement(int ar [] ){

        int result [] = new int[ar.length];
        Stack<Integer> sO = new Stack<Integer>();
        for(int i=ar.length-1; i>=0; i--){

            while(!sO.isEmpty() && sO.peek() <= ar[i]) sO.pop();

            if(sO.isEmpty()) result[i] = -1;
            else result[i] = sO.peek();

            sO.push(ar[i]);
        }
        return result;
    }

    public static void main(String args []){

        System.out.println("\nFind the next greater element in an array using stacks\n");

        int arr [] = {10, 20, 30, 40, 50, 60, 70};
        int resultArray  [] = findNextGreaterElement(arr );
        System.out.print("Arr :  ");
        for (int element : arr){
            System.out.print(element + "  ");
        }
        System.out.println();
        System.out.print("NGE :  ");
        for (int element : resultArray){
            System.out.print(element + "  ");
        }
        System.out.println();
    }

}












