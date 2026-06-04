import java.util.*;
class ticketSum {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node front=null;
    node rear=null;
    void enqueue(int val){
        node ptr=new node(val);
        if(rear==null){
            front=rear=ptr;
            return;
        }
        rear.next=ptr;
        rear=ptr;
    }
    void sum(){
        int sum=0;
        node ptr = front;
        while(ptr!= null){
            sum+=ptr.data;
            ptr=ptr.next;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ticketSum queue = new ticketSum();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            queue.enqueue(sc.nextInt());
        }
        queue.sum();
    }
}