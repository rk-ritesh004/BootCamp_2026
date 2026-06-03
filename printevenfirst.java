import java.util.*;
class printevenfirst {
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
    void display(){
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void displayevenfirst(){
        node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printevenfirst list = new printevenfirst();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.insert(sc.nextInt());
        }
        node evenHead=null;
        node evenTail=null;
        node oddHead=null;
        node oddTail=null;
        node temp=list.head;
        while(temp!=null){
            if(temp.data%2 == 0){
                if(evenHead == null){
                    evenHead=evenTail=temp;
                }else{
                    evenTail.next=temp;
                    evenTail=temp;
                }
            }else{
                if(oddHead == null){
                    oddHead=oddTail=temp;
                }else{
                    oddTail.next=temp;
                    oddTail=temp;
                }
            }
            temp=temp.next;
        }
        if (evenTail != null) evenTail.next = null;
        if (oddTail != null) oddTail.next = null;

        if (evenHead != null) {
            list.head = evenHead;
            evenTail.next = oddHead;
        } else {
            list.head = oddHead;
        }
        list.display();
        list.displayevenfirst();
        }
}

