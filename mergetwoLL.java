import java.util.*;
public class mergetwoLL {
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
    Node merge(Node h1,Node h2){
        Node result = null;
        Node tail=result;
        while(h1 != null && h2 != null){
            if(h1.data <= h2.data){
                if(result == null){
                    result = h1;
                    tail = h1;
                }else{
                    tail.next = h1;
                    tail = tail.next;
                }
                h1 = h1.next;
            }else{
                if(result == null){
                    result = h2;
                    tail = h2;
                }else{
                    tail.next = h2;
                    tail = tail.next;
                }
                h2 = h2.next;
            }
        }
        if(h1 != null){
            tail.next = h1;
        }
        if(h2 != null){
            tail.next = h2;
        }
        return result;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        mergetwoLL list1 =  new mergetwoLL();
        mergetwoLL list2 =  new mergetwoLL();
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
        Node mergedList = list1.merge(list1.head,list2.head);
        System.out.println("Merged List:");
        Node temp = mergedList;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
