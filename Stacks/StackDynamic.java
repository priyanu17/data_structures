package Stacks;

public class StackDynamic{

    StackNode root;

    static class StackNode{
        int data ;
        StackNode next;

        StackNode(int val){
            this.data = val;
            this.next = null;
        }
    }
    public void push(int val){
        StackNode newNode = new StackNode(val);
        if(root == null){
            root = newNode;
            return;
        }
        newNode.next = root;
        root = newNode;
    }
    public int pop(){
        if(root == null){
            System.out.println("Stack underflow ");
            return Integer.MIN_VALUE;
        }
        int val = root.data;
        root = root.next;
        return val;
    }
    public boolean isEmpty(){
        if (root == null) return true;
        else return false;
    }

    public int peek(){
        if(root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else return root.data;
    }

    public void printStack(){

        if(root == null){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack from top to bottom --> ");
        StackNode temp = root;
        while(temp!= null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverseStack(StackDynamic stackOb){
        
        if(stackOb.root == null){
            return;
        }

        int val = stackOb.pop();
        reverseStack(stackOb);
        stackOb.push(val);
    }
}//end of class







