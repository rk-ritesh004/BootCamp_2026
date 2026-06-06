import java.util.*;
class interleavequeue {
    public static void main(String[] args) {
        interleavequeue stack = new interleavequeue();
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            q.add(num);
        }
        Queue<Integer> firsthalf = new LinkedList<>();
        for(int i=0;i<n/2;i++){
            firsthalf.add(q.peek());
            q.remove();
        }
        while(!firsthalf.isEmpty()){
            System.out.print(firsthalf.peek()+" ");
            firsthalf.remove();
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}

