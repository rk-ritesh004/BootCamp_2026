import java.util.*;

class decodestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> stackint = new Stack<>();
        Stack<String> stackstr = new Stack<>();
        String curr = "";
        int num = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                stackint.push(num);
                stackstr.push(curr);
                num = 0;
                curr = "";
            }
            else if (ch == ']') {
                int repeat = stackint.pop();
                String prev = stackstr.pop();
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }
                curr = prev + temp.toString();
            }
            else {
                curr += ch;
            }
        }
        System.out.println(curr);
        sc.close();
    }
}
