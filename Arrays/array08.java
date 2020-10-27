package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class array08 {

    public static int kMaxElement(ArrayList<Integer> array, int k){
        if(k > array.size()) return -1;
        


        return 0;
    }
    public static int kMinElement(ArrayList<Integer> array, int k){
        if(k > array.size()) return -1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("\nFind the Kth max and min element of the array\n");

        System.out.println("\nFind the maximum and minimum element in an array\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of the array");
        String input = scan.nextLine();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(String ele : input.strip().split(" ")) array.add(Integer.parseInt(ele));

        scan.close();
    }
}
