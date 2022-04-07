//problem code:CHFCLASS
public class AkashMissingClass {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long n = ir.nextLong();
            n = n/7+(n%7==6?1:0);
            System.out.println(n);
        }
    }
}
