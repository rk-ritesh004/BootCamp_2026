import java.util.*;

public class groupanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]= sc.nextLine().split("\\s+");

        HashMap<String,ArrayList<String>> map =
                new HashMap<>();

        for(String word:arr){

            char ch[]=word.toCharArray();

            Arrays.sort(ch);

            String key=new String(ch);

            map.putIfAbsent(key,new ArrayList<>());

            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}