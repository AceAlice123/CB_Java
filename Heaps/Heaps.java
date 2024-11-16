package Heaps;

import java.util.ArrayList;
public class Heaps {
    private ArrayList<Integer> l1=new ArrayList<Integer>();
    public Heaps(){};
    public Heaps(int [] arr){
        for(int i:arr){
            Add(i);
        }
    }
    public void Add(int x){
        l1.add(x);
        upheapify(l1.size()-1);
    }
    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(l1.get(pi)>l1.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    private void swap(int ci, int pi){
        int v1=l1.get(ci);
        int v2=l1.get(pi);
        l1.set(ci,v2);
        l1.set(pi,v1);
    }
    public void Display(){
        System.out.println(l1);
    }
    public int getmin(){
        return l1.get(0);
    }
    public void remove(){Remove();}
    private void Remove(){
        swap(0,l1.size()-1 );
        l1.remove(l1.size()-1);
        downheapify(0);
    }
    private void downheapify(int pi){
        int lci= 2*pi+1;
        int rci= 2*pi+2;
        int mini=pi;
        if(lci<l1.size() && l1.get(lci)<l1.get(mini)){mini=lci;}
        if(rci<l1.size() && l1.get(rci)<l1.get(mini)){mini=rci;}
        if(pi!=mini){
            swap(mini, pi);
            downheapify(mini);
        }
        
    }
}
