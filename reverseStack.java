import java.util.*;
class reverseStack {
    class node{
        char data;
        node next;
        node(char data){
            this.data=data;
            this.next=null;
        }
    }
    node top=null;
    void push(char val){
        node ptr=new node(val);
        if(top==null){
            top=ptr;
            return;
        }
        ptr.next=top;
        top=ptr;
    }
    void pop(){
        if(top==null){
            return;
        }
        System.out.print(top.data);
        top=top.next;
    }
    boolean isempty(){
        return top==null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reverseStack stack = new reverseStack();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                stack.push(ch);
            } else {
                while (!stack.isempty()) {
                    stack.pop();
                }
                System.out.print(" ");
            }
        }
        while (!stack.isempty()) {
            stack.pop();
        }
        System.out.println();
        }
}