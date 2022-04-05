
//problem code:LAZYCHF
public class LazyChef{
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int x = ir.nextInt();
            int m = ir.nextInt();
            int d = ir.nextInt();
            System.out.println(Math.min(x*m, x+d));
        }
    }
}