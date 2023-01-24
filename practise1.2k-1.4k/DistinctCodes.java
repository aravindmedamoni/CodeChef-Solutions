import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            Set<String> set = new HashSet<>();
            String s = sc.next();
            for(int i=0;i<s.length()-1;i++){
                set.add(s.substring(i, i+2));
            }
            System.out.println(set.size());
        }
        sc.close();
    }
}
