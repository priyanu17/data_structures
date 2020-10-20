package Queues;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class queue07 {
    public static void main(String args [] ){

        System.out.println("\nGenerate numbers with two digits upto given count using queue\n");

        Queue<String> queue = new LinkedList<String>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total numbers of binary numbers to generate");
        int count = scan.nextInt();

        System.out.println("Enter two distinct digits");
        scan.nextLine();
        String [] twoNumbers = scan.nextLine().strip().split(" ");
        scan.close();

        System.out.println("first " + twoNumbers[0]);
        System.out.println("second " + twoNumbers[1]);
        if(twoNumbers[0].equals("0") ) queue.add(twoNumbers[1]);
        else if(twoNumbers[1].equals("0")) queue.add(twoNumbers[0]);
        else{
            if(Integer.parseInt(twoNumbers[0]) > Integer.parseInt(twoNumbers[1])){
                String temp = twoNumbers[0];
                twoNumbers[0] = twoNumbers[1];
                twoNumbers[1] = temp; 
            }
            queue.add(twoNumbers[0]);
            queue.add(twoNumbers[1]);
        }

        while(count > 0){
            String num = queue.poll();
            System.out.print(num + "  ");
            count--;
            queue.add(num + twoNumbers[0]);
            queue.add(num + twoNumbers[1]);
        }
    }
}
