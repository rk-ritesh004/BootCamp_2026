import java.util.*;
public class compression {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int count = 1;

            while (i+1 < s1.length() && s1.charAt(i+1) == ch) {
                count++;
                i++;
            }

            ans.append(ch).append(count);
        }

        System.out.println(ans);
    }
}
