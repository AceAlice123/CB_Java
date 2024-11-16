

package Queue;
import java.util.*;

public class Queueusingstack {
    private Stack<Integer> s1;
    public Queueusingstack(){
        s1= new Stack<>();
    }
    public boolean isempty(){
        return(s1.size()==0);
    }
    public int size(){
        return s1.size();
    }
    public void enQueue(int n){
        s1.push(n);
    }
    public void deQueue(){
        if(s1.size()==1){s1.pop();return;}
        int rv=s1.pop();
        deQueue();
        s1.push(rv);
    }
    public void display(){
        if(isempty()){return;}
        int rv = s1.pop();
        display();
        s1.push(rv);
    }


}
