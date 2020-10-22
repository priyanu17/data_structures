package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class array06 {

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> array){

        for(int left = 0, right=array.size()-1; left< right; left++, right--){
            int temp = array.get(left);
            array.set(left, array.get(right));
            array.set(right, temp);
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("\nReverse an array\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements of the array");
        String input = scan.nextLine();

        ArrayList<Integer> array = new ArrayList<Integer>();

        for(String ele : input.strip().split(" ")){
            array.add(Integer.parseInt(ele));
        }

        System.out.println("Array is ");
        for(int e : array) System.out.print(e + "  ");
        System.out.println();


        System.out.println("\nArray after reversing ");
        for(int e : reverseArray(array)) System.out.print(e + "  ");
        System.out.println();
        scan.close();

    }
}
