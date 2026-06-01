import java.util.*;

class rotateleftright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();

        int len = s.length();
        String rotate = "";

        if (ch == 'L') {
            rotate = s.substring(n) + s.substring(0, n);
        } else {
            rotate = s.substring(len - n) + s.substring(0, len - n);
        }

        char arr[] = rotate.toCharArray();

        for (int i = 0; i < n && i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        System.out.println(new String(arr));

        sc.close();
    }
}