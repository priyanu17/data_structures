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

    public void insertAtBottom(StackDynamic stackOb, int value){

        if(stackOb.root == null){
            stackOb.push(value);
            return;
        }
        
        int valMid = stackOb.pop();
        insertAtBottom(stackOb, value);
        stackOb.push(valMid);
    }

    public static void reverseStack(StackDynamic stackOb){
        
        if(stackOb.root == null){
            return;
        }

        int val = stackOb.pop();
        reverseStack(stackOb);
        stackOb.insertAtBottom(stackOb, val);
    }

    public void insertAtCorrect(StackDynamic stackOb, int value){

        if(stackOb.isEmpty()){
            stackOb.push(value);
            return;
        }
        if( stackOb.peek()> value ){
            int valTop = stackOb.peek();
            stackOb.pop();
            insertAtCorrect(stackOb, value);
            stackOb.push(valTop);
        }
        else{
           stackOb.push(value); 
        }
    }

    public static void sortStack(StackDynamic stackOb){

        //base condition
        if(stackOb.root == null) return;

        int val = stackOb.pop();
        sortStack(stackOb);
        stackOb.insertAtCorrect(stackOb, val);

    }

    public static StackDynamic sortStackUsingTempStack(StackDynamic stackOb, StackDynamic newStack){

        //base condition
        if(stackOb.isEmpty()) return newStack;

        int valOldTop= stackOb.pop();
        if(newStack.isEmpty() || valOldTop >= newStack.peek()) newStack.push(valOldTop);
        else {
            newStack.insertAtCorrect(newStack, valOldTop);
        }
        sortStackUsingTempStack(stackOb, newStack);
        return newStack;
    }

 
    public static void deleteMiddleElement(StackDynamic stackOb, StackNode middleNode, StackNode endNode){

        if(endNode.next == null || endNode.next.next == null) {
            stackOb.pop();
            return;
        }
        int val = middleNode.data;
        stackOb.pop();
        deleteMiddleElement(stackOb, middleNode.next, endNode.next.next);
        stackOb.push(val);
    }
}//end of class








