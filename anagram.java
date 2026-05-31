import java.util.*;
public class anagram {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int freq[] = new int[26];
        if(s1.length() != s2.length()){
            System.out.println(s1+" is not Anagram");
        }else{
            for(int i=0;i<s1.length();i++){
                char ch = s1.charAt(i);
                freq[ch-'a']++;
            }
            for(int i=0;i<s2.length();i++){
                char ch = s2.charAt(i);
                freq[ch-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println(s1 + " is not Anagram");
                return;
            }
        }
        System.out.println(s1 + " is Anagram");
    }
}
