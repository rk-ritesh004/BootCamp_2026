import java.util.*;
public class middleofLL {
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
    void findmiddle(){
        Node slow = head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: " + slow.data);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        middleofLL list =  new middleofLL();
        int N = sc.nextInt();
        System.out.println("Insert node in sorted order");
        for(int i=0;i<N;i++){
            list.insert(sc.nextInt());
        }
        list.findmiddle();
    }
}
