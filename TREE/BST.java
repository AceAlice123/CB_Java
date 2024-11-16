package TREE;

public class BST {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BST(){root=null;}
    public BST(int[] arr){
        root=Createtree(arr,0,arr.length-1);
    }
    private Node Createtree(int[] arr, int low,int high){
        if(low>high){return null;}
        Node nn= new Node();
        int mid =(low+high)/2;
        nn.val=arr[mid];
        nn.left=Createtree(arr,low,mid-1);
        nn.right =Createtree(arr,mid+1,high);
        return nn;
    }
    public void Display(){
        display(root);
    }
    private void display(Node nn){
        if(nn==null){return;}
        String output="";
        output="<--"+nn.val+"-->";
        if(nn.left==null){output="Null"+output;}
        else{output=nn.left.val+output;}
        if(nn.right==null){output+="Null";}
        else{output+=nn.right.val;}
        System.out.println(output);
        display(nn.left);
        display(nn.right);

    }
}
