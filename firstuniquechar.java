import java.util.*;
public class firstuniquechar{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int freq[] = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(freq[ch-'a']==1){
                System.out.println(i + " - " + ch);
                break;
            }
        }
    }
}