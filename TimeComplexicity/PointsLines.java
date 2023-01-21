import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PointsLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            Set<Integer> s1 = new HashSet<>(5);
            Set<Integer> s2 = new HashSet<>(5);
            for(int i=0;i<n;i++){
                s1.add(sc.nextInt());
                s2.add(sc.nextInt());
            }
            
            System.out.println(s1.size()+s2.size());
        }
        sc.close();
    }
}
