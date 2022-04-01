
//problem code:TYRE
public class TyreProblem {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            System.out.println(ir.nextInt()*2+ir.nextInt()*4);
        }
    }
}
