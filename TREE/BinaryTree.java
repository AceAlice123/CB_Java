package TREE;

import java.util.*;

public class BinaryTree {
    public class Node {
        int val;
        Node Left;
        Node Right;
    }
    Node root;
    Scanner scn = new Scanner(System.in);
    public BinaryTree(){
        root =createtree();
    }
    public Node createtree(){
        System.out.println("Type some value ");
        int item=scn.nextInt();
        Node nn= new Node();
        nn.val=item;
        System.out.println("Has Left? ");
        boolean hlc=scn.nextBoolean();

        if(hlc){nn.Left=createtree();}

        System.out.println("Has Right? ");
        boolean hrc=scn.nextBoolean();

        if(hrc){nn.Right=createtree();}

        return nn;
    }
    public void Display(){
        display(root);
    }
    private void display(Node nn){
        if(nn==null){return;}
        String output="";
        output="<--"+nn.val+"-->";
        if(nn.Left==null){output="Null"+output;}
        else{output=nn.Left.val+output;}
        if(nn.Right==null){output+="Null";}
        else{output+=nn.Right.val;}
        System.out.println(output);
        display(nn.Left);
        display(nn.Right);

    }
    public int Max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn==null){return -1;}
        else{return Math.max(nn.val,Math.max(max(nn.Left),max(nn.Right)));}
    }
    public boolean present(int query) {
        return find(query,root);
    }
    private boolean find(int query,Node nn){
        if(nn==null){return false;}
        if(query==nn.val){return true;}
        boolean left=find(query,nn.Left);
        if(!left){
            return find(query, nn.Right);
        }
        else{return true;}
    }
    public int height(){
        return hgh(root, 0);
    }
    private int hgh(Node nn, int h){
        if(nn==null){return h;}
        int lefth=hgh(nn.Left,h+1);
        int righth=hgh(nn.Right,h+1);
        return Math.max(lefth,righth);
    }
    public void infix(){
        infi(root);
    }
    private void infi(Node nn){
        if(nn==null){return;}
        infi(nn.Left);
        System.out.println(nn.val+"-->");
        infi(nn.Right);
    }
    public void prefix(){
        pre(root);
    }
    private void pre(Node nn){
        if(nn==null){return;}
        System.out.print(nn.val+"-->");
        pre(nn.Left);
        pre(nn.Right);
    }
    public void postfix(){
        post(root);
    }
    private void post(Node nn){
        if(nn==null){return;}
        post(nn.Left);
        post(nn.Right);
        System.out.println(nn.val+"-->");
    }

}
