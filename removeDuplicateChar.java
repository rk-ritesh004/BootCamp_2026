import java.util.*;
public class removeDuplicateChar {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(result.indexOf(ch)==-1){
        //         result += ch;
        //     }
        // }
        for(int i=0;i<str.length();i++){
            if(!result.contains(str.charAt(i)+"")){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
