package Heaps;

public class Implem {
    public static void main(String[] args) {
        int [] arr1={10,20,30,1,5,7,3,2};
        Heaps h1 = new Heaps(arr1);
        h1.Display();
        h1.Add(-2);
        h1.Display();
        h1.remove();
        h1.Display();

    }
}
