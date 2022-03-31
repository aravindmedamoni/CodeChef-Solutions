import java.util.Arrays;

//problem code:CM164364
public class ChocolateMonger {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int x = ir.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextLong();
            }
            Arrays.sort(a);
            int count=1;
            long item=a[0];
            for(int i=1;count+x<n&&i<n;i++){
                if(item !=a[i]){
                    count++;
                    item = a[i];
                }
            }
            System.out.println(x==n?0:count);
        }
    }
}
