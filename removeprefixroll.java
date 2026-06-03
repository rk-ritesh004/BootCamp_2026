import java.util.*;
public class removeprefixroll {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void insert(int data, String prefix){
        String num = Integer.toString(data);
        if(num.startsWith(prefix)){
            return;
        }
        node ptr = new node(data);
        if(head == null){
            head = ptr;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = ptr;
    }
void removeprefix(String prefix){
    node prev = null;
    node curr = head;
    while(curr != null){
        String str = Integer.toString(curr.data);
        if(str.startsWith(prefix)){
            if(prev == null){
                head = curr.next;
            }
            else{
                prev.next = curr.next;
            }
        }
        else{
            prev = curr;
        }
        curr = curr.next;
    }
}
    void display(){
        node temp=head;
        while(temp != null){
            System.out.print("Rollno: "+temp.data+" ");
            temp=temp.next;
        }
    }
    node head=null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeprefixroll list = new removeprefixroll();
        int n=sc.nextInt();
        int data;
        String prefix = sc.next();
        for(int i=0;i<n;i++){
            data = sc.nextInt();
            list.insert(data, prefix);
        }
        list.display();
        list.removeprefix(prefix);
        list.display();
    }
}
