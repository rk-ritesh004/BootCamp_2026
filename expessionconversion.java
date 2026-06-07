import java.util.*;
public class expessionconversion {
    int precedence(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if(ch == '^'){
            return 3;
        }else{
            return -1;
        }
    }
    String infixToPostfix(String exp){
        String result = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result += st.pop();
                }
                st.pop();
            }else{
                while(!st.isEmpty() && precedence(ch) <= precedence(st.peek())){
                    result  += st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
    String infixToPrefix(String exp){
        StringBuilder sb = new StringBuilder(exp);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch == '('){
                sb.setCharAt(i, ')');
            }else if(ch == ')'){
                sb.setCharAt(i,'(');
            }
        }
        String postfix = infixToPostfix(sb.toString());
        
        return new StringBuilder(postfix).reverse().toString();
    }
    String postfixToInfix(String exp){
        Stack<String> st = new Stack<>();
        for(char c : exp.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }else{
                String a = st.pop();
                String b = st.pop();
                st.push("("+a+c+b+")");
            }
        }
        return st.pop();
    }
    String prefixToinfix(String exp){
        Stack<String> st = new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }else{
                String a = st.pop();
                String b = st.pop();
                st.push("("+a+ch+b+")");
            }
        }
        return st.pop();
    }
    String postfixToprefix(String exp){
        Stack<String> st = new Stack<>();
        for(char c : exp.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }else{
                String a = st.pop();
                String b = st.pop();
                st.push("("+c+a+b+")");
            }
        }
        return st.pop();
    }
    public static void main(String arg[]){
        String pre = "+a*bc";
        String post = "abc*+";
        String in = "a+b*c";
        expessionconversion ob = new expessionconversion();
        String result = ob.infixToPostfix(in);
        System.out.println(result);
        String res1 = ob.infixToPrefix(in);
        System.out.println(res1);
        System.out.println(ob.postfixToInfix(post));
        System.out.println(ob.prefixToinfix(pre));
        System.out.println(ob.postfixToprefix(post));
        
    }
}
