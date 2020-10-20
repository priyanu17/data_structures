package BinaryTrees;

public class BinaryTree {

    public treeNode root ;

    public static class treeNode{

        int data;
        treeNode left;
        treeNode right;

        treeNode(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    BinaryTree(){
        this.root = null;
    }
    BinaryTree(int value){
        treeNode rootNode = new treeNode(value);
        this.root = rootNode;
    }

}
