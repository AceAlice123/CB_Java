package OOPS;

public class Home {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println(c1.cat_name);
        Cat c2 = new Cat("neko1", "black", "royal");
        c2.hellocat();
    }
}
