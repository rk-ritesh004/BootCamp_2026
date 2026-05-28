#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    int d1=0,d2=0;
    // Big O(n^2)
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         if(i==j) d1 += arr[i][j];
    //         else if(i+j == n-1) d2 += arr[i][j];
    //     }
    // }
    // Big O(n)
    for(int i=0;i<n;i++){
        d1+=arr[i][i];
        d2+=arr[i][n-1-i];
    }
    printf("%d",d1-d2);
    return 0;

}