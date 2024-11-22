package maps_sets;

import java.util.*;
public class hashsets {
    public static void main(String[] args) {
        HashSet <Integer> hs= new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        Random rand = new Random();
        for(int i =1;i<10;i++){
            ts.add(rand.nextInt(6));
            hs.add(rand.nextInt(7));
            ls.add(rand.nextInt(9));
        }
        ls.add(4);ls.add(5);ls.add(4);
        System.out.println(ts);
        System.out.println(hs);
        System.out.println(ls);

    }
}
