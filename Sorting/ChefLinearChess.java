
// problem code:LINCHESS
public class ChefLinearChess {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long k = ir.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextLong();
            }
            long count= (long) Math.pow(10, 9);
            long num=a[0];
            boolean isDiv = false;
            for(int i=0;i<n;i++){
                if(k%a[i]==0 && k/a[i]<count){
                    count = k/a[i];
                    num=a[i];
                    isDiv=true;
                }
            }
            System.out.println(isDiv?num:-1);
        }
    }
}
