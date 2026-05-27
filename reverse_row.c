<<<<<<< HEAD
#include<stdio.h>
int main(){
    int r,c;
    scanf("%d%d",&r,&c);
    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<r;i++){
        int left=0;
        int right=c-1;
        while(left<right){
            int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
            left++;
            right--;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
=======
#include<stdio.h>
int main(){
    int r,c;
    scanf("%d%d",&r,&c);
    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<r;i++){
        int left=0;
        int right=c-1;
        while(left<right){
            int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
            left++;
            right--;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
>>>>>>> 73d76c9 (Initial commit: Add all C programs)
}