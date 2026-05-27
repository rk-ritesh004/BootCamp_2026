#include<stdio.h>
int main(){
    int arr[100][100];
    int r,c;
    scanf("%d%d",&r,&c);
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }   
    int insertType,insertIndex;
    scanf("%d%d",&insertType,&insertIndex);
    if(insertType==0){
        for(int i=r;i>insertIndex;i--){
            for(int j=0;j<c;j++){
                arr[i][j]=arr[i-1][j];
            }
        }
        for(int j=0;j<c;j++){
            scanf("%d",&arr[insertIndex][j]);
        }
        r++;
    }else{
        for(int j=c;j>insertIndex;j--){
            for(int i=0;i<r;i++){
                arr[i][j]=arr[i][j-1];
            }
        }
        for(int i=0;i<r;i++){
            scanf("%d",&arr[i][insertIndex]);
        }
        c++;
    }
    int deleteType,deleteIndex;
    scanf("%d%d",&deleteType,&deleteIndex);
    if(deleteType==0){
        for(int i=deleteIndex;i<r-1;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=arr[i+1][j];
            }
        }
        r--;
    }else{
        for(int j=deleteIndex;j<c-1;j++){
            for(int i=0;i<r;i++){
                arr[i][j]=arr[i][j+1];
            }
        }
        c--;
    }
    printf("Updated Matrix:\n");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}