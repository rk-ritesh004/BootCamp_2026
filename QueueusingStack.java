public class QueueusingStack {
    int max = 5;
    int st1[] = new int[max];
    int st2[] = new int [max];
    int top1=-1,top2=-1;
    void push(int data){
        if(top1 == max-1){
            System.out.println("Full");
            return;
        }
        top1++;
        st1[top1] = data;
    }
    void pop() {
        if(top1 == -1) {
            System.out.println("Queue Empty");
            return;
        }
        while(top1 != -1) {
            st2[++top2] = st1[top1--];
        }
        System.out.println("Deleted: " + st2[top2--]);
        while(top2 != -1) {
            st1[++top1] = st2[top2--];
        }
    }
    public static void main(String arg[]){
        QueueusingStack q = new QueueusingStack();
        q.push(10);
        q.push(20);
        q.push(30);
        q.pop();
    }
}
