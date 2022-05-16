
//Problem Code:MISSP
public class ChefDolls {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[ir.nextInt()]++;
            }
            for(int i=0;i<n;i++){
                if(a[i]%2!=0){
                    System.out.println(i);
                }
            }

        }
    }
}
