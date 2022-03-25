//problem code:	GROUPASSGN

public class GroupAssignment {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long n = ir.nextLong();
            long x = ir.nextLong();
            long pRollNum=1;
            pRollNum = 2*n-(x-1);
            System.out.println(pRollNum);
        }
    }
}
