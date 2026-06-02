import java.util.*;
class updatePrice {
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

    void insert(int data) {
        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ptr;
    }
    void update(int index, int value) {
        Node temp = head;
        int i = 0;

        while (i < index && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            temp.data = value;
        }
    }
    void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        updatePrice list = new updatePrice();
        int N = sc.nextInt();
        int n;
        for(int i=0;i<N;i++){
            n=sc.nextInt();
            list.insert(n);
        }
        int ind = sc.nextInt();
        int data = sc.nextInt();
        list.update(ind,data);

        list.display();
    }
}
