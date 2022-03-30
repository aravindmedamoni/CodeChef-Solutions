
//problem code:DIV03
public class DaanishProblems {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        long[] a = new long[10];
        while(t-->0){
            for(int i=0;i<10;i++){
                a[i] = ir.nextLong();
            }
            long k = ir.nextLong();
            for(int i=9;k>0&&i>=0;i--){
                if(a[i]>0){
                    long temp=k;
                    k = k-a[i];
                    a[i] = temp>a[i]?0:a[i]-temp;
                }
            }
            for(int i=9;i>=0;i--){
                if(a[i]>0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
