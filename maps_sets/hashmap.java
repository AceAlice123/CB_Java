package maps_sets;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class hashmap {
    public static void main(String[] args) {
        HashMap <Integer ,Integer> hm= new HashMap<>();
        TreeMap <Integer, Integer> tm = new TreeMap<>();
        LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
        Random rnd = new Random();
        for(int i =2;i<18;i+=2){
            hm.put(i,rnd.nextInt(i));
            tm.put(i,rnd.nextInt(i));
            lm.put(i,rnd.nextInt(i));  
        }
        
        System.out.println(hm);
        System.out.println(tm);
        System.out.println(lm);
        System.out.println();
        System.out.println(hm);
        System.out.println(hm.put(3,8));
        System.out.println(hm);
        System.out.println(hm.get(3));
        hm.remove(3);
        System.out.println(hm.get(3));

    }
    


}
