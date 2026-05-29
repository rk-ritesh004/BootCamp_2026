import java.util.Scanner;

public class skipvowels {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
