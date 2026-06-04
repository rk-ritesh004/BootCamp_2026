import java.util.*;

class circularqueue {

    int MAX = 5;
    int front = -1;
    int rear = -1;
    int que[] = new int[MAX];

    void enqueue(int val) {

        if (front == (rear + 1) % MAX) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % MAX;
        que[rear] = val;

        System.out.println(val + " inserted");
    }

    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + que[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
    }

    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(que[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % MAX;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        circularqueue q = new circularqueue();

        while (true) {

            System.out.println("\n1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}