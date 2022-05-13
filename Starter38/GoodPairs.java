public class GoodPairs {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i] = ir.nextLong();
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i<j && a[i]==b[j] && b[i]==a[j]){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
