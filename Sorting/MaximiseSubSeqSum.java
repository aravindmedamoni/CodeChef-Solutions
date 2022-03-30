import java.util.Arrays;

//problem code:SIGNFLIP
public class MaximiseSubSeqSum {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int k = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;k>0 && a[i]<0 && i<n;i++){
               a[i] = a[i]*-1;
               k--;
            }
            Arrays.sort(a);
            int sum=0;
            for(int i=0;i<n;i++){
                if(a[i]>0){
                    sum +=a[i];
                }
            }
            System.out.println(sum);
        }
    }
}
