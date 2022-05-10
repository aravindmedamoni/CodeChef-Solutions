
//problem code:ATM2
public class ATM2 {
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
            for(int i=0;i<n;i++){
                if(k>0&&k-a[i]>=0){
                    k -=a[i];
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();

        }
    }
}
