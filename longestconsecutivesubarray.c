#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int count=1,max=1;
    for(int i=1;i<n;i++){
        if(arr[i]>arr[i-1]){
            count++;
        }else{
            count=1;
        }
        if(count>max){
            max=count;
        }
    }
    printf("%d",max);
}