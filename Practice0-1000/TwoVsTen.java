//problem code :TWOVSTEN
public class TwoVsTen{
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long x = ir.nextLong();
            if(x%5==0){
                if(x%10==0){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }else{
                System.out.println(-1);
            }
        }
    }
}