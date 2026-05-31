import java.util.*;
public class longestcommonprefix{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        if(str.length == 0 || str[0].length() == 0){
            System.out.println("");
            return;
        }
        for(int i=0;i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(i>=str[i].length()||ch!=str[j].charAt(i)){
                    System.out.println(str[0].substring(0,i));
                    return;
                }
            }
        }
        System.out.println(str[0]);
    }
}