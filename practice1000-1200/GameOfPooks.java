//problem code: POOK
public class GameOfPooks {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long n = ir.nextLong();
            if(n==1 || n==2){
                System.out.println(1);
            }else if(n==3){
                System.out.println(n-1);
            }else{
                System.out.println(n);
            }
        }
    }
}
