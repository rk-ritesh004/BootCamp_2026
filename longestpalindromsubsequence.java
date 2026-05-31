import java.util.*;
public class longestpalindromsubsequence {
    static boolean isPalindrome(String str,int i,int j){
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else{
                i++;j--;
            }
        }
        return true;
    }
    static String longestPalindrome(String str){
        int max=0,start=0,end=0;
        int n=str.length();
        String longest="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(str,i,j)){
                    if(j-i+1 > max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return str.substring(start, end + 1);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestPalindrome(str));
    }
}
