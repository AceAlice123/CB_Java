import java.util.*;
public class stack1 {
    public static void main(String[] args) {
        // Stack<Integer> s1=new Stack<>();
        // s1.push(1);s1.push(2);s1.push(3);
        // System.out.println(s1.toString());
        // addatfirst(s1, 0);
        // reversestk(s1);
        // System.out.println(s1.toString());
        int arr1[] =new int[]{2,3,1,2,4,2,5};
        display(arr1);
        // display(NGERstk(arr1));
        // display(NSERstk(arr1));
        display(NSELstk(arr1));

    }
    public static void addatfirst(Stack<Integer> stk,int val ){
        if(stk.empty()){stk.push(val);return;}
        int x=stk.pop();
        addatfirst(stk, val);
        stk.push(x);
    }
    public static void reversestk(Stack<Integer> stk){
        if(stk.empty()){return;}
        int x =stk.pop();
        reversestk(stk);
        addatfirst(stk, x);
    }
    public static int[] NGERstk(int[] arr){
        int [] nge=new int[arr.length];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s1.empty() && arr[i]>arr[s1.peek()]){
                nge[s1.pop()]=arr[i];
            }
            s1.push(i);
        }
        while(!s1.empty()){nge[s1.pop()]=-1;}
        return nge;
    }
    public static int[] NSERstk(int[] arr){
        int [] nse=new int[arr.length];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s1.empty() && arr[i]<arr[s1.peek()]){
                nse[s1.pop()]=arr[i];
            }
            s1.push(i);
        }
        while(!s1.empty()){nse[s1.pop()]=-1;}
        return nse;
    }
    public static void display(int [] arr){
        for(int i: arr){System.out.print(i+" ");}
        System.out.println();
    }
    public static int[] NGELstk(int[] arr){
        int [] nge=new int[arr.length];
        Stack<Integer> s1=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s1.empty() && arr[i]>arr[s1.peek()]){
                nge[s1.pop()]=arr[i];
            }
            s1.push(i);
        }
        while(!s1.empty()){nge[s1.pop()]=-1;}
        return nge;
    }
    public static int[] NSELstk(int[] arr){
        int [] nse=new int[arr.length];
        Stack<Integer> s1=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s1.empty() && arr[i]<arr[s1.peek()]){
                nse[s1.pop()]=arr[i];
            }
            s1.push(i);
        }
        while(!s1.empty()){nse[s1.pop()]=-1;}
        return nse;
    }

}
