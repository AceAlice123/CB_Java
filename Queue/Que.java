package Queue;

public class Que {
    public static void main(String[] args) {
        // Queues q1= new Queues();
        // q1.enQueue(0);
        // q1.enQueue(1);
        // q1.enQueue(2);
        // q1.enQueue(3);
        // q1.enQueue(4);
        // while(!q1.isempty()){
        //     q1.deQueue();
        // }
        // q1.enQueue(0);
        // q1.enQueue(1);
        // q1.enQueue(4);
        // q1.enQueue(4);
        // q1.enQueue(0);
        // q1.display();
        // q1.deQueue();
        // q1.display();
        Queueusingstack q2= new Queueusingstack();
        q2.enQueue(0);
        q2.enQueue(1);
        q2.enQueue(4);
        q2.enQueue(4);
        q2.enQueue(0);
        q2.display();
        q2.deQueue();
        q2.display();
    }
}
