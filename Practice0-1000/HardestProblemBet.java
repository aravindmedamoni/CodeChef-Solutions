
//problem code:HARDBET
public class HardestProblemBet {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int A = ir.nextInt();
            int B = ir.nextInt();
            int C = ir.nextInt();
            if(A<B && A<C){
                System.out.println("Draw");
            }else if(B>C){
                System.out.println("Alice");
            }else if(B<C){
                System.out.println("Bob");
            }
        }
    }
}
