package Arrays;

import java.util.Scanner;

public class array01 {

    public static void rotateArray(int ar [] , int d){

        int n = ar.length;
        d = d%n;
        //take first d elements 
        int arTemp [] = new int[d];
        for(int i=0; i<d; i++) arTemp[i] = ar[i];
        for(int i=d; i<n; i++) ar[i-d] = ar[i];
        for(int i=0; i<d; i++) ar[n-d+i] = arTemp[i];

        for(int element : ar){
            System.out.print(element + "  ");
        }
        System.out.println();
    }
    public static void main(String args [] ){
        System.out.println("\nRotate an array by d elements\n");
        
        int ar [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times to rotate the array");
        int d = scan.nextInt();
        rotateArray(ar, d);
        scan.close();
    }
}
