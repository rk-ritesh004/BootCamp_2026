import java.util.*;
class trappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxl = new int[n];
        int[] maxr = new int[n];
        maxl[0] = height[0];
        maxr[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            maxl[i] = Math.max(height[i],maxl[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            maxr[i] = Math.max(height[i],maxr[i+1]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res += Math.min(maxl[i],maxr[i])-height[i];
        }
        return res;
    }
    public int trap2pointer(int[] height) {
        int n = height.length;
        int maxl=0,maxr=0;
        int l=0,r=n-1;
        int res=0;
        while(l<=r){
            maxl = Math.max(maxl,height[l]);
            maxr = Math.max(maxr,height[r]);
            if(maxl<maxr){
                res += maxl - height[l];
                l++;
            }else{
                res += maxr - height[r];
                r--;
            }
        }
        return res;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        trappingRainWater trw = new trappingRainWater();
        System.out.println(trw.trap(height));
    }
}