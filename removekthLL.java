import java.util.*;
public class removekthLL {
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
    void deletekth(int ind,int N){
        Node ptr = head;
        if(ind < 0 || ind > N){
            System.out.println("Invalid position");
            return;
        }
        if(ind == 1){
            if(head.next == null){
                System.out.println(ptr.data);
                head=null;
            }
            head = head.next;
            System.out.println(ptr.data);
        }else{
            int i=0;
            Node temp=null;
            while(i<ind-1 && ptr != null){
                temp = ptr;
                ptr=ptr.next;
                i++;
            }
            temp.next=ptr.next;
            System.out.println(ptr.data);
        }
    }
    void display(){
        Node temp=head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        removekthLL list = new removekthLL();
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            list.insert(sc.nextInt());
        }
        list.display();
        int k = sc.nextInt();
        list.deletekth(k,N);
        list.display();

    }
}
