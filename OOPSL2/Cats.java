package OOPSL2;
// Inheritence
public class Cats extends Animal {
    private String name="NA";
    String voice ="NA";
    String color ="NA";
    //default constructor
    public Cats(){}
    // getter 
    public String callcat(){
        return this.name;
    }
    public Cats(
        String name,
        String voice,
        String color,
        int legs,
        boolean tail){
            this.color=color;
            this.legs=legs;
            this.tail=tail;
            this.voice=voice;
            this.name=name;
    }
   
}
