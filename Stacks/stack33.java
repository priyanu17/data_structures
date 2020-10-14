package Stacks;

public class stack33 {
    public static void main(String args [] ){



        String s = "anupriya";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
            System.out.println("i is : " + i);
            String s1 = s.substring(0, i);
            String s2 = "*";
            String s3 = s.substring(i+1);
            s = s1 + s2 + s3;
            System.out.println("s is : " + s);
            }
        }
        System.out.println(s);
        System.out.println("Done");
    }
}
