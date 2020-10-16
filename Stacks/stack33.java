package Stacks;
import java.util.Stack;

public class stack33 {

    public static int stackMax(Stack<Integer> stack){
        //function not needed
        int max = Integer.MIN_VALUE;
        while(stack!= null){
        }
        return max;
    }
    public static void main(String args []){

        System.out.println("\nFind the maximum element of a stack without distorting it\n");

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);

        System.out.println("Print stack from bottom to top -->");
        for(int e : stack) System.out.print(e + "  ");
        System.out.println();

        int max = Integer.MIN_VALUE;
        for (int e : stack){
            if(e > max) max = e;
        }
        System.out.println("Max is : " + max);
        
    }   
}
