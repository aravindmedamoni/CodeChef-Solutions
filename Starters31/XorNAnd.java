
//problem code:XORAND
public class XorNAnd {
    public static void main(String[] args) {
        InputReader ir  = new InputReader(System.in);
        System.out.println((2^3)<(2&3));
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long[] a = new long[n];
            long count=0;
            for(int i=0;i<n;i++){
                a[i] = ir.nextLong();
            }
            for(int i=0;i<n-1;i++){
                if((a[i]^a[i+1])<(a[i]&a[i+1])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
