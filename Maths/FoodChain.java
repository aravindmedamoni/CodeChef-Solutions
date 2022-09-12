
//Problem Code:FODCHAIN
public class FoodChain {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            System.out.println((long)Math.floor(Math.log10(ir.nextLong())/Math.log10(ir.nextLong()))+1);
        }
        ir.close();
    }
}
