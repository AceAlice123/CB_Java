package OOPS;

import java.sql.Date;

public class batch {
    String batch_name;
    String topic;
    int cost;
    Date StartDate;

    //constructor
    public batch(){ //default constructor
        this.batch_name="default batch";
        this.StartDate = new Date(20240707);
        this.cost=30000;
        this.topic="Java";

    }
    // custom constructor
    public batch(String name, int price, String title){
        this.batch_name=name;
        this.cost=price;
        this.topic=title;
    }
}
