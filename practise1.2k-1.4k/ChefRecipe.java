import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ChefRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            Map<String, String> map = new HashMap<>();
            for(byte i=0;i<n;i++){
                String s = sc.next();
                String c = sc.next();
                map.put(s, c);
            }
            Set<String> keys = map.keySet();
            int count=0;
            for(String key:keys){
                if(map.get(key).equals("+")){
                    count++;
                }else{
                    count--;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
