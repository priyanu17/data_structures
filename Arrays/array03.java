package Arrays;

public  class array03 {
    public static void main(String args [] ){
        System.out.println("\nRotate array by 1 in clockwise direction\n");

        int ar [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array is : ");
        for(int element : ar) System.out.print(element + "  ");
        System.out.println();

        int val = ar[0];
        for(int i=1; i<ar.length; i++) ar[i-1] = ar[i];
        ar[ar.length-1] = val;

        System.out.println("Array is : ");
        for(int element : ar) System.out.print(element + "  ");
        System.out.println();
    }
}
