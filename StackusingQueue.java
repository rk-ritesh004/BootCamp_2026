public class StackusingQueue {
    int max = 5;
    int qu[] = new int [max];
    int front = -1,rear=-1;
    void enqueue(int data){
        if(rear == max-1){
            System.out.println("Full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        qu[++rear] = data;
    }
    void dequeue(){
        if(front == -1){
            System.out.println("Empty");
            return;
        }
        if(front == rear){
            System.out.println("Deleted:"+qu[rear]);
            front =rear=-1;
        }
        System.out.println("Deleted:"+qu[rear]);
        rear--;

    }
    public static void main(String arg[]){
        StackusingQueue q = new StackusingQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.enqueue(30);
        q.dequeue();
    }
}
