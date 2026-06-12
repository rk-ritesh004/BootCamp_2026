import java.util.*;
public class stackll {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            st.push(sc.nextInt());
        }
        for(int i=0;i<st.size();i++){
            System.out.print(st.get(i)+" ");
        }
        System.out.println("Top element is "+st.pop());
        for(int i=0;i<st.size();i++){
            System.out.print(st.get(i)+" ");
        }
        System.out.println("Top element is "+st.pop());

    }
}
