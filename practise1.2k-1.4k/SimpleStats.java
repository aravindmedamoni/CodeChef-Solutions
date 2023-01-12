import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleStats {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<k;i++){
                arr[i]=0;
                arr[n-(i+1)]=0;
            }
            double res=0;
            for(int i=k;i<n-k;i++){
                res +=arr[i];
            }
            res = res/(n-2*k);
            DecimalFormat dc = new DecimalFormat("0.000000");
            System.out.println(dc.format(res));
        }
        sc.close();
    }
}
