import java.util.*;

public class sumrange {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int s = sc.nextInt();
        int l = 0;
        int r = n - 1;
        while(l < r) {
            int sum = arr[l] + arr[r];
            if(sum == s) {
                System.out.println(l + " " + r);
                return;
            }
            else if(sum < s) {
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println("-1");
    }
}