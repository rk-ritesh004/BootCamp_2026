import java.util.*;
public class stackLLopr {
    class node{
        char data;
        node next;
        node(char ch){
            this.data = ch;
            this.next = null;
        }
    }
    node top=null;
    void push(char ch){
        node ptr = new node(ch);
        System.out.println("Added Section: "+ch);
        if(top==null){
            top=ptr;
            return;
        }
        ptr.next=top;
        top=ptr;
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        System.out.println("Removing Section: "+top.data);
        top=top.next;
    }
    boolean isempty(){
        return top==null;
    }
    void display(){
        if(top==null){
            System.out.println("stack is empty.");
            return;
        }
        node ptr = top;
        System.out.print("Enrolled Sections are: ");
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackLLopr stack = new stackLLopr();
        while(true){
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    String ch = sc.next();
                    stack.push(ch.charAt(0));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Exiting...");
        }
        }
    }

}
