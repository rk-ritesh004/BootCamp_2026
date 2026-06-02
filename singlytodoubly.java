import java.util.*;
public class singlytodoubly {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    void insert(int data){
        Node ptr = new Node(data);
        if(head == null){
            head=ptr;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=ptr;
    }
    void convert(){
        if(head == null) return;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
    }
    void display(){
        Node temp=head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    void displayCircular() {
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    do{
        System.out.print(temp.data + "->");
        temp = temp.next;
    }while(temp != head);
    System.out.println("(head)");
}
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        singlytodoubly list =  new singlytodoubly();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            list.insert(sc.nextInt());
        }
        list.display();
        list.convert();
        list.displayCircular();
    }
}
