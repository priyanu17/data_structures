package Queues;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue05 {

    public static boolean checkStackPermutation(Queue<Integer> input, Queue<Integer> output){

        Stack<Integer> stack = new Stack<Integer>();

        while(!input.isEmpty()){
            int ele = input.poll();
            if(ele == output.peek()){
                output.poll();
                System.out.println(ele + " pushed to stack from input");
                System.out.println(ele + " poped from stack to output");
                while(!stack.isEmpty()) {
                    if(stack.peek() == output.peek()){
                        System.out.println(stack.peek() + " poped from satck to output");
                        stack.pop();
                        output.poll();
                        
                    }
                    else break;
                }
            }
            else {
                stack.push(ele);
                System.out.println(ele + " pushed to stack from input");
            }

        }
        return (input.isEmpty() && stack.isEmpty());
    }
    public static void main(String args [] ){
        System.out.println("\nStack Permutations check\n");

        Scanner scan = new Scanner(System.in);

        Queue<Integer> inputQueue = new LinkedList<Integer>();
        System.out.println("Enter length of input queue");
        int inputQueueLength = scan.nextInt();
        System.out.println("Enter " +  inputQueueLength + " elements of the input queue");

        for(int i=0; i<inputQueueLength ; i++){
            inputQueue.add(scan.nextInt());
        }
        System.out.println("Displaying input queue ");
        for(int item : inputQueue ) System.out.print(item + "  ");
        System.out.println();


        Queue<Integer> outputQueue = new LinkedList<Integer>();
        System.out.println("Enter length of output queue");
        int outputQueueLength = scan.nextInt();
        System.out.println("Enter " +  outputQueueLength + " elements of the output queue");

        for(int i=0; i<outputQueueLength ; i++){
            outputQueue.add(scan.nextInt());
        }
        System.out.println("Displaying output queue ");
        for(int item : outputQueue ) System.out.print(item + "  ");
        System.out.println();

        boolean result = false;
        if(inputQueueLength == outputQueueLength)
        result = checkStackPermutation(inputQueue, outputQueue);
        
        if(result) System.out.println("Yes stack permutation is possible");
        else System.out.println("No stack permutation is not possible");
        scan.close();   
    }
}
