#include<stdio.h>
#include<stdlib.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    int count[max+1];
    for(int i=0;i<max+1;i++){
        count[i]=0;
    }
    for(int i=0;i<n;i++){
        count[arr[i]]++;
    }
    for(int i=0;i<max+1;i++){
        if(count[i]>n/4){
            printf("%d",i);
            exit(0);
        }
    }
    printf("No element appears more than n/4 times");
}
