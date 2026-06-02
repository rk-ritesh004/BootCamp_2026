import java.util.*;
class traversedoublyLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail=null;
    void insert(int data) {
        Node ptr = new Node(data);

        if (head == null) {
            head= tail = ptr;
            return;
        }
        tail.next=ptr;
        ptr.prev = tail;
        tail=ptr;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    void displayrev(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        traversedoublyLL list = new traversedoublyLL();
        int N = sc.nextInt();
        int n;
        for(int i=0;i<N;i++){
            n=sc.nextInt();
            list.insert(n);
        }
        System.out.println("List in original order");
        list.display();
        System.out.println("\nList in reverse order");
        list.displayrev();
    }
}
