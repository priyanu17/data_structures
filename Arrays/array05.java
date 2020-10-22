package Arrays;

public class array05 {

    public static int gcdOfTwo(int a, int b){
        //base condition
        if( a==0) return b;
        return gcdOfTwo(b%a, a);
    }

    public static int lcmOfTwo(int a, int b){
        return (a*b/gcdOfTwo(a, b));
    }

    public static int lcmOfArray(int array []){
        int lcm = array[0];
        for(int i=0; i<array.length; i++) lcm = lcmOfTwo(lcm, array[i]);
        return lcm;
    }
    public static void main(String args [] ){

        System.out.println("\nLCM of an array\n");

        int array [] = {20, 40, 60, 80};
        System.out.println("LCM is : " + lcmOfArray(array));

    }
}
