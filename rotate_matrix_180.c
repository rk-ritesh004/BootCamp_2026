<<<<<<< HEAD
#include<stdio.h>
int main(){
    int r,c;
    scanf("%d %d",&r,&c);
    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Rotated matrix by 180 degrees:\n");
    for(int i=r-1;i>=0;i--){
        for(int j=c-1;j>=0;j--){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    return 0;
=======
#include<stdio.h>
int main(){
    int r,c;
    scanf("%d %d",&r,&c);
    int arr[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Rotated matrix by 180 degrees:\n");
    for(int i=r-1;i>=0;i--){
        for(int j=c-1;j>=0;j--){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    return 0;
>>>>>>> 158fa4dedc1946dad81317a32742b3d9a5069222
}