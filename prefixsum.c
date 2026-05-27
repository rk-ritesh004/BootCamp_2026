<<<<<<< HEAD
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[50];
    int prefix[50];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    prefix[0]=0;
    for(int i=1;i<=n;i++){
        prefix[i]=prefix[i-1]+arr[i-1];
    }
    int l,r;
    scanf("%d %d",&l,&r);
    int sum=prefix[r]-prefix[l-1];
    printf("sum=%d",sum);
=======
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[50];
    int prefix[50];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    prefix[0]=0;
    for(int i=1;i<=n;i++){
        prefix[i]=prefix[i-1]+arr[i-1];
    }
    int l,r;
    scanf("%d %d",&l,&r);
    int sum=prefix[r]-prefix[l-1];
    printf("sum=%d",sum);
>>>>>>> 73d76c9 (Initial commit: Add all C programs)
}