import java.util.*;

public class longestcommonsubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int subsequence[][] = new int[s1.length()+1][s2.length()+1];

        for(int i=1;i<=s1.length();i++) {

            for(int j=1;j<=s2.length();j++) {

                if(s1.charAt(i-1) == s2.charAt(j-1))
                    subsequence[i][j] = subsequence[i-1][j-1] + 1;
                else
                    subsequence[i][j] = Math.max(subsequence[i-1][j], subsequence[i][j-1]);
            }
        }

        System.out.println("LCS Length = " + subsequence[s1.length()][s2.length()]);
        int i=s1.length(), j=s2.length();
        String lcs = "";
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                lcs = s1.charAt(i-1)+lcs;
                i--;
                j--;
            }else if(subsequence[i-1][j] > subsequence[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        System.out.println("LCS = " + lcs);
    }
}