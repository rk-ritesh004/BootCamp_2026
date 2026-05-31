import java.util.*;
public class validparenthesis {
    public static boolean isValid(String s){
            int n = s.length();
            char stack[] = new char[n];
            int top=-1;
            if(n % 2 == 1) return false;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    top++;
                    stack[top] = s.charAt(i);
                }else{
                    if(s.charAt(i)==')' && stack[top] != '(' || s.charAt(i)=='}' && stack[top] != '{' || s.charAt(i)==']' && stack[top] != '['){
                        return false;
                    }
                    top--;
                }
            }
            return true;
        }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isValid(str))
            System.out.println("Valid Parenthesis");
        else
            System.out.println("Invalid Parenthesis");
    }
}
