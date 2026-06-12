import java.util.*;
public class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r){
            if(!Character.isLetter(arr[l])){
                l++;
            }else if(!Character.isLetter(arr[r])){
                r--;
            }else{
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;r--;
            }
        }
        System.out.println(arr);
    }
}
