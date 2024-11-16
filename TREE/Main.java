package TREE;

public class Main {
    public static void main(String[] args) {
        // BinaryTree BT= new BinaryTree();
        // BT.Display();
        // // System.out.println(BT.Max());
        // System.out.println();
        // // System.out.println(BT.present(0));
        // System.out.println(BT.height());
        // BT.infix();
        int[] arr1={1,2,3,4,5,6,7,8,9};
        BST bst = new BST(arr1);
        bst.Display();
    }
}
