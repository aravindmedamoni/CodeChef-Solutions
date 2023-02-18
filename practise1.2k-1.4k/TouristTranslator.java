import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TouristTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String alp="abcdefghijklmnopqrstuvwxyz";
        String s = sc.next();
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<26;i++){
            if(Character.isAlphabetic(s.charAt(i))){
                map.put(String.valueOf(alp.charAt(i)),String.valueOf(s.charAt(i)));
                map.put(String.valueOf(alp.charAt(i)).toUpperCase(),String.valueOf(s.charAt(i)).toUpperCase());
            }
        }
        while (t-->0) {
         StringBuffer sb = new StringBuffer();
            s = sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='_'){
                    sb.append(" ");
                }else if(map.containsKey(String.valueOf(s.charAt(i)))){
                    sb.append(map.get(String.valueOf(s.charAt(i))));
                }else{
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}
