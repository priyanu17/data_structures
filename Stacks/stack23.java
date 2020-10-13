package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class stack23 {

    public static int [] calculateSpan(int [] prices){

        int span [] = new int[prices.length];
        Stack<Integer> sO = new Stack<Integer>();

        for(int i=0; i<prices.length; i++ ){

            while(!sO.isEmpty() && prices[sO.peek()] < prices[i]) sO.pop(); 

            if(sO.isEmpty()) span[i] = i+1;
            else span[i] = i - sO.peek();

            sO.push(i);

        }
        return span;
    }
    public static void main(String args [] ){

        System.out.println("\nThe Stock Span problem\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of days ");
        int numberOfDays = scan.nextInt();

        int [] prices = new int[numberOfDays];
        System.out.println("Enter " + numberOfDays + " stock prices");
        for(int i=0; i<numberOfDays; i++)
        prices[i] = scan.nextInt();

        int [] span = calculateSpan(prices);

        for(int element : span) System.out.print( element + "  ");
        System.out.println();

        scan.close();
    }
}
