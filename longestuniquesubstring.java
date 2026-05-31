import java.util.*;
public class longestuniquesubstring {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int freq[] = new int[256];

        int left = 0;
        int max = 0;

        for(int right = 0; right < str.length(); right++) {

            freq[str.charAt(right)]++;

            while(freq[str.charAt(right)] > 1) {
                freq[str.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        System.out.println("Length = " + max);
    }
}
