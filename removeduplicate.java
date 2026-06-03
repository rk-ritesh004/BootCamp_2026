import java.util.*;
class removeduplicate {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    void insert(int data){
        node ptr = new node(data);
        if(head==null){
            head=ptr;
            return;
        }
        ptr.next=head;
        head=ptr;
    }
    void removedup() {
    node temp = head;
    while (temp != null) {
        node pt = temp;
        while (pt != null && pt.next != null) {
            if (temp.data == pt.next.data) {
                pt.next = pt.next.next;
            } else {
                pt = pt.next;
            }
        }
        temp = temp.next;
    }
    }
    void display(){
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeduplicate list = new removeduplicate();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.insert(sc.nextInt());
        }
        list.removedup();
        list.display();
    }
}
