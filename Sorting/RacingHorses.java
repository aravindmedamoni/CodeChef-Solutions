import java.util.Arrays;

//problem code:HORSES
public class RacingHorses {
    public static void main(String[] args) {
        InputReader ir  = new InputReader(System.in);
        int t  = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextLong();
            }
            Arrays.sort(a);
            long d=a[1];
            for(int i=1;i<n;i++){
                if(a[i]-a[i-1]<d){
                    d=a[i]-a[i-1];
                }
            }
            System.out.println(d);
        }
    }
}
