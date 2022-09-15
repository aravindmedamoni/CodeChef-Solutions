import java.util.Arrays;

//Problem Code:SUBARRY
public class InterestSubArray {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long arr[] = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = ir.nextLong();
            }
            long min = Arrays.stream(arr).min().getAsLong();
            long max = Arrays.stream(arr).max().getAsLong();
            long minIntrs = min<0 && max<0?max*max:min<0&&max>0?min*max:min*min;
            long MaxIntrs = min*min>max*max?min*min:max*max;
            System.out.println(minIntrs+" "+MaxIntrs);
        }
    }
}
