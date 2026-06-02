import java.util.*;
class circularLL {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail=null;
    void insert(int data) {
        Node ptr = new Node(data);

        if (head == null) {
            head= tail = ptr;
            ptr.next=ptr;
            return;
        }
        tail.next=ptr;
        tail=ptr;
        tail.next=head;
    }
    void delete(int pos, int N) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (pos < 0 || pos > N) {
        System.out.println("Invalid position");
        return;
    }
    if (pos == 1) {
        Node temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        System.out.println("Deleted: " + temp.data);
        return;
    }
    Node temp = head;
    Node ptr = null;
    int i=0;
    while(i<pos-1 && temp.next!=head){
        ptr=temp;
        temp=temp.next;
        i++;
    }
    ptr.next=temp.next;
    if(temp==tail){
        tail=ptr;
        tail.next=head;
    }
    System.out.println("Deleted: " + temp.data);

}
    void display(){
        Node temp = head;
        while(temp.next!= head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circularLL list = new circularLL();
        int N = sc.nextInt();
        int n;
        for(int i=0;i<N;i++){
            n=sc.nextInt();
            list.insert(n);
        }
        list.display();
        int ind = sc.nextInt();
        list.delete(ind, N);
        list.display();
    }
}