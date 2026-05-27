<<<<<<< HEAD
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int diff=arr[0]-arr[n-1];
    printf("%d",diff);
=======
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int diff=arr[0]-arr[n-1];
    printf("%d",diff);
>>>>>>> 73d76c9 (Initial commit: Add all C programs)
}