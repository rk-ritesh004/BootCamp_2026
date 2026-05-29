import java.util.*;
public class useridgeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String id = sc.next();
        String name[] = fname.split(" ");
        String first = name[0];
        String last = name[name.length - 1];
        String userId = first.toLowerCase()+"_"+last.toLowerCase()+id;
        System.out.println(userId);
        sc.close();
    }
}
