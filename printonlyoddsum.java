import java.util.*;
class printonlyoddsum{
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
        int sum=0;
        int num=ptr.data;
        while(num>0){
            sum = sum+num%10;
            num = num/10;
        }
        if(sum%2==0){
            return;
        }else{
            if(head==null){
                head=ptr;
                return;
            }
            node temp = head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=ptr;
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
        printonlyoddsum list = new printonlyoddsum();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.insert(sc.nextInt());
        }
        list.display();
        }
    }
