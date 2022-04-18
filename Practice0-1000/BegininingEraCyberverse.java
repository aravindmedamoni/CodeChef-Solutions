
//problem code:CYBV
public class BegininingEraCyberverse {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long k = ir.nextLong();
            System.out.println(k/n);
        }
    }
}
