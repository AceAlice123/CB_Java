package Queue;
public class Queues {
    private int []arr;
    private int front=0;
    private int size=0;
    public Queues(){
        arr=new int[5];
    }
    public Queues(int n){
        arr = new int[n];
    }
    public boolean isempty(){
        return(size==0);
    }
    public void enQueue(int n){
        int ptr = (front+size)%arr.length;
        arr[ptr]=n;
        size++;
    }
    public int deQueue(){
        int rv=arr[front%arr.length];
        front++;
        size--;
        return rv;
    }
    public int getfront(){
        return arr[front];
    }
    public int size(){return size;}
    public void display(){
        for(int i=front%arr.length;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<((size+front)%arr.length);i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
