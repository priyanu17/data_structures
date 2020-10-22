package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class array07 {

    public static int maxOfArray(ArrayList<Integer> array){
        int max = array.get(0);
        for(int e : array) if(e > max) max = e;
        return max;
    }

    public static int minOfArray(ArrayList<Integer> array){
        int min = array.get(0);
        for(int e : array) if(e < min) min = e;
        return min;
    }
    public static void main(String[] args) {
        System.out.println("\nFind the maximum and minimum element in an array\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of the array");
        String input = scan.nextLine();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(String ele : input.strip().split(" ")) array.add(Integer.parseInt(ele));

        System.out.println("Maximum value is : " + maxOfArray(array));
        System.out.println("Minimum value is : " + minOfArray(array));
        scan.close();
    }   
}
