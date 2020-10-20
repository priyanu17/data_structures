package Queues;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class queue06 {

    public static boolean giveChange(Queue<Integer> input){
        int fiveCount = 0;
        int tenCount = 0;

        boolean giveChangeToAll = true;

        while(!input.isEmpty()){
            int element = input.poll();
            //input is 5
            if(element == 5) fiveCount++;
            //input is 10
            else if(element == 10) {
                if(fiveCount >0) {
                    fiveCount--;
                    tenCount++;
                }
                else {
                    giveChangeToAll = false;
                    break;
                }
            }
            //input is 20
            else {
                if( fiveCount >=3 || (tenCount > 0 && fiveCount > 0)){
                    if(tenCount > 0) {
                        tenCount --;
                        fiveCount --;
                    }
                    else{
                        fiveCount = fiveCount -3;
                    }
                }
                else{
                    giveChangeToAll = false;
                    break;
                }
            }
           
        }

        return giveChangeToAll;
    }
    public static void main(String args [] ){
        System.out.println("\nGive change to every person in a queue\n");

        Scanner scan = new Scanner(System.in);

        Queue<Integer> inputQueue = new LinkedList<Integer>();
        System.out.println("Enter length of the queue");
        int inputQueueLength = scan.nextInt();
        System.out.println("Enter " +  inputQueueLength + " elements of the queue");

        for(int i=0; i<inputQueueLength ; i++){
            inputQueue.add(scan.nextInt());
        }
        System.out.println("Displaying queue ");
        for(int item : inputQueue ) System.out.print(item + "  ");
        System.out.println();

        boolean result = giveChange(inputQueue);
        if(result) System.out.println("YES");
        else System.out.println("NO");
        scan.close();
    }
}
