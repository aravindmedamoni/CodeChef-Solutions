
//problem code:FINDSHOES
public class FindingShoes {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int m = ir.nextInt();
            System.out.println(n-m>0?(n-m)+n:n);
        }
    }
}
