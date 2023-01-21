import java.util.Arrays;
import java.util.Scanner;

public class MaximizeMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n= sc.nextInt();
            int k = sc.nextInt();
            long[] vals = new long[n];
            for(int i=0;i<n;i++){
                vals[i] = sc.nextLong();
            }
            Arrays.sort(vals);
            if(k<n){
                System.out.println(vals[k]);
            }else{
                System.out.println(vals[n-1]);
            }
        }
        sc.close();
    }
}