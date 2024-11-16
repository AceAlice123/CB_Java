package OOPS;

public class Cat {
    String cat_name;
    String color;
    String Breed;
    //default constructor
    public Cat(){
        this.cat_name="Unknown";
        this.Breed="Unknown";
        this.color="Unknown";
    }
    public Cat(String name, String color, String breed){
        this.cat_name=name;
        this.Breed=breed;
        this.color=color;
    }
    public void hellocat(){
        System.out.println("Hi! I am "+this.cat_name+" and my color is "+ this.color);
    }
    
}
