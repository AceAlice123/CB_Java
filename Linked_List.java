class Linked_List{
    class Node {
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    
    public void addfirst(int n){
        Node nn =new Node();
        nn.data=n;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;

    }
    public void addlast(int n ){
        if(size==0){addfirst(n);}
        else{
            Node nn = new Node();
            nn.data=n;
            tail.next=nn;
            tail=nn;
            size++;

        }
    }
    public Node kidx(int k){
        Node temp=head;
        while(k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public void addk(int n, int k){
        if(size==0 || k==0){addfirst(n);}
        else if(k==size-1){addlast(n);}
        else{
            Node temp= kidx(k-1);
            Node nn = new Node();
            nn.data=n;
            nn.next=temp.next;
            temp.next=nn;
            size++;
        }
    }
    public int getfirst(){
        return head.data;
    }
    public int getlast(){
        return tail.data;
    }
    public int getk(int k ){
        if(k>size-1 || k<0){return -1;}
        else if(k==0){return head.data;}
        else if(k==size-1){return tail.data;}
        else {
            return kidx(k).data;
        }
        
    }
    public int removefirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rv;
    }
    public int removelast(){
        int rv=tail.data;
        if(size==1){removefirst();}
        else{
            Node tail_1=kidx(size-2);
            tail_1.next=null;
            tail=tail_1;
            size--;
        }
        return rv;
    }
    public int removeidx(int k){
        int rv=-1;
        if(k==0){return removefirst();}
        else if(k==size-1){return removelast();}
        else{
            Node k_1th = kidx(k-1);
            Node temp=k_1th.next;
            rv = temp.data;
            k_1th.next=temp.next;
            temp.next=null;
            size--;
            
        }
        return rv;
        
    }
    public int size(){
        return size;
    }
    public void diplay(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

}