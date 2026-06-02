import java.util.*;

public class minwindowsubstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int freq[] = new int[256];
        for(char c : t.toCharArray()) {
            freq[c]++;
        }
        int count = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int ansStart = 0;
        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if(freq[c] > 0) {
                count--;
            }
            freq[c]--;
            while(count == 0) {
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    ansStart = left;
                }
                char leftChar = s.charAt(left);
                freq[leftChar]++;
                if(freq[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE) {
            System.out.println("No Window Found");
        } else {
            System.out.println(
                s.substring(ansStart, ansStart + minLen)
            );
        }
    }
}