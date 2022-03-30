import java.util.Arrays;

//problem code:MAXDIFF
public class MaxWeightDiff {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int k = ir.nextInt();
            int[] w = new int[n];
            for(int i=0;i<n;i++){
                w[i] = ir.nextInt();
            }
            Arrays.sort(w);
            long d=0;
            long sum1=0;
            long sum2=0;
            if(k>n/2)
            k=n-k;
            for(int i=0;i<k;i++){
                sum1 +=w[i];
            }
            for(int i=k;i<n;i++){
                sum2 +=w[i];
            }
            d = Math.abs(sum2-sum1);
            System.out.println(d);
        }
    }
}
