package TimeComplexicity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChocolateMongor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            Set<Integer> s = new HashSet<>();
            for(int i=0;i<n;i++){
                s.add(sc.nextInt());
            }
            int k = n-s.size();
            if(k>=x){
                System.out.println(s.size());
            }else{
                System.out.println(s.size()-(x-k));
            }
        }
        sc.close();
    }
}
