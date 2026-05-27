<<<<<<< HEAD
#include <stdio.h>
#include <string.h>

int main(){
    char str[50];
    int count = 0;
    scanf("%s", str);
    for(int i = 0; i < strlen(str); i++){
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
            count++;
        }
    }
    printf("%d",count);
=======
#include <stdio.h>
#include <string.h>

int main(){
    char str[50];
    int count = 0;
    scanf("%s", str);
    for(int i = 0; i < strlen(str); i++){
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
            count++;
        }
    }
    printf("%d",count);
>>>>>>> 73d76c9 (Initial commit: Add all C programs)
}