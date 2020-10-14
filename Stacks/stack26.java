package Stacks;

import java.util.Stack;

public class stack26{

    public static int greatestLRIndexProduct(int ar [] ){

        int leftArr [] = new int[ar.length];
        int rightArr [] = new int[ar.length];

        Stack<Integer> leftStack = new Stack<Integer>();
        Stack<Integer> rightStack = new Stack<Integer>();

        //finding left greatest element
        for(int i=0; i<ar.length; i++){

            while(!leftStack.isEmpty() && ar[leftStack.peek()] <= ar[i] ) leftStack.pop();

            if(leftStack.isEmpty()) leftArr[i] = 0;
            else leftArr[i] = leftStack.peek() ;

            leftStack.push(i);
        }

        //finding right greatest element
        for(int i=ar.length-1; i>=0; i--){

            while(!rightStack.isEmpty() && ar[rightStack.peek()] <= ar[i]) rightStack.pop();

            if(rightStack.isEmpty()) rightArr[i] = 0;
            else rightArr[i] = rightStack.peek();

            rightStack.push(i);

        }   
        //now left array and right array have indexes of greatest elements
        for(int i=0; i<ar.length; i++)
            if(leftArr[i] != 0 && rightArr[i] != 0) leftArr[i] = ((leftArr[i] + 1)*(rightArr[i] + 1));
            else leftArr[i] = 0;
        
        //find the greatest index product
        int maxProduct = leftArr[0];
        for(int i=1; i<ar.length; i++) if(maxProduct< leftArr[i]) maxProduct = leftArr[i];
    
        return maxProduct;
    }
    public static void main(String args []){

        System.out.println("Find the Greatest LR product index in an array");
        int arr1 [] = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int LRproduct1 = greatestLRIndexProduct(arr1);
        System.out.println("Maximum LR index product for array 1 is : " + LRproduct1);

        int arr2 [] = {5, 4, 3, 4, 5};
        int LRproduct2 = greatestLRIndexProduct(arr2);
        System.out.println("Maximum LR index product for array 1 is : " + LRproduct2);

    }
}