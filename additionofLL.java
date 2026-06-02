import java.util.*;
public class additionofLL {
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
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        additionofLL list1 =  new additionofLL();
        additionofLL list2 =  new additionofLL();
        System.out.println("Enter the number of digits in first list:");
        int n1 = sc.nextInt();
        System.out.println("Enter the digits for first list:");
        for(int i=0;i<n1;i++){
            list1.insert(sc.nextInt());
        }
        System.out.println("Enter the number of digits in second list:");
        int n2 = sc.nextInt();
        System.out.println("Enter the digits for second list:");
        for(int i=0;i<n2;i++){
            list2.insert(sc.nextInt());
        }
    }
}
