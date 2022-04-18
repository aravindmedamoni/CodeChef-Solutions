//problem code:CAN_REACH
public class CanReach {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
           int x = ir.nextInt();
           int y = ir.nextInt();
           int k = ir.nextInt();
           if(x%k==0 && y%k==0)
           System.out.println("Yes");
           else
           System.out.println("No");
        }
    }
}
