import java.text.DecimalFormat;

//problem code:NAICHEF
public class NaiveChef {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int a = ir.nextInt();
            int b = ir.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=ir.nextInt();
            }
            double acount=0;
            double bcount=0;
            for(int i=0;i<n;i++){
                if(arr[i]==a){
                    acount++;
                }
                if(arr[i]==b){
                    bcount++;
                }
            }
            DecimalFormat df = new DecimalFormat("0.0000000000");
            double count = (acount/n)*(bcount/n);
            System.out.println(df.format(count));
        }
    }
}
