import java.util.*;

class replacepattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String pattern = sc.next();
        String temp = sc.next();

        char repl = temp.charAt(0);
        int i = 0;
        String result = "";
        while(i < str.length()) {

            boolean match = true;

            for(int j = 0; j < pattern.length(); j++) {

                if(i + j >= str.length() || str.charAt(i + j) != pattern.charAt(j)) {

                    match = false;
                    break;
                }
            }

            if(match) {
                result += repl;
                i += pattern.length();
            }
            else {
                result += str.charAt(i);
                i++;
            }
        }

        System.out.println(result);
    }
}