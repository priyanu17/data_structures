package Arrays;

import java.util.Scanner;

public class array02 {

    public static int [] reverseArray(int ar[], int start, int end){
        for(int left=start, right= end-1; left<right; left++, right--){
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
        }
        return ar;
    }

    public static int []  rotateUsingReverseArray(int ar [], int d){

        ar = reverseArray(ar, 0, d);
        ar = reverseArray(ar, d, ar.length);
        ar = reverseArray(ar, 0, ar.length);

        return ar;
    }
    public static void main(String args [] ){
        System.out.println("\nReversal Algorithm for array rotation\n");

        int ar [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Array is :");
        for(int element : ar) System.out.print(element + "  ");
        System.out.println();

        //take input d
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of d : ");
        int d = scan.nextInt();
        
        int result [] = rotateUsingReverseArray(ar, d);

        System.out.println("Rotation of array is :");
        for(int element : result) System.out.print(element + "  ");
        System.out.println();
        
        scan.close();
    }
}