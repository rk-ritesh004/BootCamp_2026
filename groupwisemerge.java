import java.util.*;
public class groupwisemerge {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    Node reverseK(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            head.next = reverseK(next, k);
        }
        return prev;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        groupwisemerge list = new groupwisemerge();
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("\nOriginal List:");
        list.display();
        list.head = list.reverseK(list.head, k);
        System.out.println("\nAfter Group Wise Reversal:");
        list.display();
    }
}