import java.text.DecimalFormat;

//problem code:SNAPE
public class SnapeLadder {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int A = ir.nextInt();
            int B = ir.nextInt();
            DecimalFormat df = new DecimalFormat("#.0####");
            double max = Math.sqrt(A*A+B*B);
            double min = Math.sqrt(B*B-A*A);
            System.out.println(df.format(min)+" "+df.format(max));
        }
    }
}
