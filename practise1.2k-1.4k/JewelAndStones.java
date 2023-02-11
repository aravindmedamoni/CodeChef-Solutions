import java.util.HashMap;
import java.util.Scanner;

public class JewelAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            String j = sc.next();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for(byte i=0;i<j.length();i++){
                int val = map.getOrDefault(j.charAt(i), 0);
                map.put(j.charAt(i),++val);
            }
            int count=0;
            for(byte i=0;i<s.length();i++){
                if(map.getOrDefault(s.charAt(i),0)>0){
                    count++;
                }
            }
            System.out.println(count);

        }
        sc.close();
    }
}
