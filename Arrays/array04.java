package Arrays;

public class array04 {

    public static int gcdOfTwo(int a, int b){
        //base condition
        if(a == 0) return b;
        return gcdOfTwo(b%a, a);
    }

    public static int gcdOfArray(int array [] ){
        int gcd = gcdOfTwo(array[0], array[1]);
        for(int i=2; i<array.length; i++) gcd = gcdOfTwo(gcd, array[i]);
        return gcd;
    }
    public static void main(String args [] ){
        System.out.println("Find the GCD of given array");

        int array [] = {5, 10, 15, 20, 25, 30};

        System.out.println("GCD of array is : " + gcdOfArray(array));

    }
}
