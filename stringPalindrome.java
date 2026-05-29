import java.util.*;
public class stringPalindrome {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println(str +" is not a palindrome");
                return;
            }
        }
        System.out.println(str +" is a palindrome");
        sc.close();
    }
}
