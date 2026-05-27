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
    int maxsum=0;
    int index;
    for(int i=0;i<r;i++){
        int sum=0;
        for(int j=0;j<c;j++){
            sum+=arr[i][j];
        }
        if(sum>maxsum){
            maxsum=sum;
            index=i;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(i==index){
                continue;
            }else{
                printf("%d ",arr[i][j]);
            }
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
    int maxsum=0;
    int index;
    for(int i=0;i<r;i++){
        int sum=0;
        for(int j=0;j<c;j++){
            sum+=arr[i][j];
        }
        if(sum>maxsum){
            maxsum=sum;
            index=i;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(i==index){
                continue;
            }else{
                printf("%d ",arr[i][j]);
            }
        }
        printf("\n");
    }
>>>>>>> 73d76c9 (Initial commit: Add all C programs)
}