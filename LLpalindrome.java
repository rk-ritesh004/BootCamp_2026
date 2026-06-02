import java.util.*;
public class LLpalindrome {
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
    boolean ispalindrome(){
        if(head == null || head.next == null)
            return true;
        Node slow= head,fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr = slow;
        while(curr != null){
            Node nextnode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        Node left = head;
        Node right = prev;
        while(right != null){
            if(left.data != right.data)
                return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        LLpalindrome list =  new LLpalindrome();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            list.insert(sc.nextInt());
        }
        if(list.ispalindrome())
            System.out.println("List is palindrome");
        else
            System.out.println("List is not palindrome");
    }
}
