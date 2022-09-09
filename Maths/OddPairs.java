
//Problem Code:ODDPAIRS
public class OddPairs {
    public static void main(String[] args) {
        
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long n = ir.nextLong();
            System.out.println(2*(n/2*(n-n/2)));
        }
    }
}
