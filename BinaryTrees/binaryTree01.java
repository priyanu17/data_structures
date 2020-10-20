package BinaryTrees;

public class binaryTree01 {
    public static void main(String args [] ){

        System.out.println("\nCreate and implement a binary tree\n");
        /*
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    5      6    7 
           /   \ 
          8     9 
        */
        BinaryTree binTreeObject = new BinaryTree();

        //create root node 1
        binTreeObject.root  = new BinaryTree.treeNode(1);

        //chile nodes 2 and 3
        BinaryTree.treeNode leftToRoot = new BinaryTree.treeNode(2);
        BinaryTree.treeNode rightToRoot = new BinaryTree.treeNode(3);

        //child nodes 4 and 5
        BinaryTree.treeNode leftToLeftToRoot = new BinaryTree.treeNode(4);
        BinaryTree.treeNode rightToLeftToRoot = new BinaryTree.treeNode(5);

        //child nodes 6  and 7
        BinaryTree.treeNode leftToRightToRoot = new BinaryTree.treeNode(6);
        BinaryTree.treeNode rightToRightToRoot = new BinaryTree.treeNode(7);

        //child nodes 8 and 9
        BinaryTree.treeNode leftToLeftToLeftToRoot = new BinaryTree.treeNode(8);
        BinaryTree.treeNode rigthToLeftToLeftToRoot = new BinaryTree.treeNode(9);

        //make parrent child links

        binTreeObject.root.left = leftToRoot;
        binTreeObject.root.right = rightToRoot;

        binTreeObject.root.left.left = leftToLeftToRoot;
        binTreeObject.root.left.right = rightToLeftToRoot;

        binTreeObject.root.right.left = leftToRightToRoot;
        binTreeObject.root.right.right = rightToRightToRoot;

        binTreeObject.root.left.left.left = leftToLeftToLeftToRoot;
        binTreeObject.root.left.left.right = rigthToLeftToLeftToRoot;
        
        System.out.println("Binary Tree implementation successful");
    }   
}
