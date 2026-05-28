<<<<<<< HEAD
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Leaders in the array are: ");
    int max = arr[n-1];
    printf("%d ",max);
    for(int i=n-2;i>=0;i--){
        if(arr[i]>max){
            printf("%d ",arr[i]);
            max = arr[i];
        }
    }
=======
#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Leaders in the array are: ");
    int max = arr[n-1];
    printf("%d ",max);
    for(int i=n-2;i>=0;i--){
        if(arr[i]>max){
            printf("%d ",arr[i]);
            max = arr[i];
        }
    }
>>>>>>> 158fa4dedc1946dad81317a32742b3d9a5069222
}