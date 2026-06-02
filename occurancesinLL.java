import java.util.*;
public class occurancesinLL {
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
    void countoccurances(int key){
        int count=0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                count++;
            }
            temp=temp.next;
        }
        System.out.println("Occurance of "+key+" is "+count);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        occurancesinLL list = new occurancesinLL();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            list.insert(sc.nextInt());
        }
        int key = sc.nextInt();
        list.countoccurances(key);
    }
}
