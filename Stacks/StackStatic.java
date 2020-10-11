package Stacks;

public class StackStatic {
    
    static final int MAX = 1000;
    int top;
    int ar[] = new int[MAX];

    StackStatic(){
        top = -1;
    }

    public void push(int value){
        if(top<(MAX-1)){
            top++;
            ar[top] = value;
        }
        else {
            System.out.println("Stack overflow");
        }
    }

    public int pop(){
        if(top<0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else  {
            int val = ar[top];
            top--;
            return val;
        }  
    }

    public boolean isEmpty(){
        if(top<0) return true;
        else return false;

    }

    public int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int val = ar[top];
            return val;
        }
    }

    public void printStack(){
        if(top>=0){
            System.out.println("\nStack from bottom to top --> ");
            for(int i=0; i<=top;i++){
                System.out.print(ar[i] + "  ");
            }
            System.out.println("\n");
        }
        else System.out.println("Stack Underflow");
    }

}//end of class
