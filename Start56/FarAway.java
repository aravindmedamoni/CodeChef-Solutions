
//Problem Code:FARAWAY
public class FarAway {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int m = ir.nextInt();
            //int[] arr = new int[n];
            long sum=0;
            for(int i=0;i<n;i++){
                int v = ir.nextInt();
                if(v<=m/2){
                    sum +=m-v;
                }else{
                    sum +=v-1;
                }
            }
            System.out.println(sum);
        }
    }
}
