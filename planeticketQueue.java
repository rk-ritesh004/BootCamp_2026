import java.util.*;
public class planeticketQueue {
    class Node{
        int id;
        String type;
        Node next;
        Node(int id, String type){
            this.id=id;
            this.type=type;//landing or takeoff
            this.next=null;
        }
    }
    Node front, rear;
    void enqueue(int id,String type){
        Node newNode = new Node(id,type);
        if(front==null){
            newNode.next= newNode;;
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
            rear.next=front;
        }
    }
    void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            System.out.println("Dequeued: "+front.id+" "+front.type);
            front=rear=null;
        }
        else{
            System.out.println("Dequeued: "+front.id+" "+front.type);
            front=front.next;
            rear.next=front;
        }
    }
    void display(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        do{
            System.out.println(temp.id+" "+temp.type);
            temp=temp.next;
        }while(temp!=front);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        planeticketQueue pq = new planeticketQueue();
        while(true){
            int ch = sc.nextInt();
            switch(ch){
                case 1: int id = sc.nextInt();
                        String type = sc.next();
                        pq.enqueue(id, type);
                        break;
                case 2: pq.dequeue();
                        break;
                case 3: pq.display();
                        break;
                case 4: System.exit(0);
            }
        }
    }
}
