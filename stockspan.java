import java.util.*;
public class stockspan{
    public static void main(String arg[]){
        stockspan ob = new stockspan();
        int price[] = {100,80,60,70,60,75,85};
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[price.length];
        for(int i=0;i<price.length;i++){
            while(!st.isEmpty() && price[st.peek()] <= price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}