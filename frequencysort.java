import java.util.*;
public class frequencysort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int freq[] =new int[100];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<100;i++){
            if(freq[i]>0){
                for(int j=0;j<freq[i];j++){
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
}
