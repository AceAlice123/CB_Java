public class linkll {
    public static void main(String[] args) {
        Linked_List l1= new Linked_List();
        l1.addfirst(10);
        l1.addfirst(20);
        l1.addfirst(30);
        // l1.diplay();
        System.out.println("");
        l1.addlast(10);
        l1.addlast(20);
        l1.addlast(30);
        // l1.diplay();
        // System.out.println(l1.kidx(3));
        System.out.println("");
        l1.addk(5, 0);
        l1.diplay();
        System.out.println("");
        // System.err.println(l1.getk(2));
        l1.removelast();
        l1.diplay();


    }
}
