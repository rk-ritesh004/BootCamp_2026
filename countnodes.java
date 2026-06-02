import java.util.*;
class countnodes {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void insert(int data) {
        Node ptr = new Node(data);
        if (head == null) {
            head = ptr;
            return;
        }
        ptr.next = head;
        head=ptr;
    }
    void count() {
        Node ptr = head;
        int count=0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countnodes list = new countnodes();
        int N = sc.nextInt();
        int n;
        for(int i=0;i<N;i++){
            n=sc.nextInt();
            if(n == -1) 
            {   list.count();
                return;
            }
            list.insert(n);
        }
    }
}
