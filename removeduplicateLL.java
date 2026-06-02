import java.util.*;
public class removeduplicateLL {
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
    void removeduplicate() {

    Node temp = head;

    while(temp != null) {
        Node prev = temp;
        Node nextnode = temp.next;
        while(nextnode != null) {
            if(temp.data == nextnode.data) {
                prev.next = nextnode.next;
                nextnode = prev.next;
            } else {
                prev = nextnode;
                nextnode = nextnode.next;
            }
        }
        temp = temp.next;
        }
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
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        removeduplicateLL list =  new removeduplicateLL();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            list.insert(sc.nextInt());
        }
        list.removeduplicate();
        list.display();
    }
}
