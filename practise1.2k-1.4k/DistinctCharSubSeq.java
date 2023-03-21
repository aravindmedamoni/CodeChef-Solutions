import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCharSubSeq {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            Set<Character> chars = new HashSet<>(s.length());
            for(int i=0;i<s.length();i++){
                chars.add(s.charAt(i));
            }
            System.out.println(chars.size());
        }
        sc.close();
    }
}
