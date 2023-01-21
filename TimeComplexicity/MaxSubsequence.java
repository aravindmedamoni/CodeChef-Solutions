import java.util.Arrays;
import java.util.Scanner;

public class MaxSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] vals = new int[n];
            for(int i=0;i<n;i++){
                vals[i]=sc.nextInt();
            }
            Arrays.sort(vals);
            for(int i=0;i<k;i++){
                if(vals[i]<0){
                    vals[i] *=-1;
                }
            }
            Arrays.sort(vals);
            int sum=0;
            for(int i=0;i<n;i++){
                if(vals[i]>0){
                    sum +=vals[i];
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
