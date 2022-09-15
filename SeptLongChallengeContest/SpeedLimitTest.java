
//Problem Code:SPEEDTEST
public class SpeedLimitTest {
    public static void main(String[] args) {
        
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            double a = ir.nextDouble();
            double x = ir.nextDouble();
            double b = ir.nextDouble();
            double y = ir.nextDouble();

            if(x/a == y/b){
                System.out.println("Equal");
            }else if(x/a<y/b){
                System.out.println("Alice");
            }else{
                System.out.println("Bob");
            }
        }

    }
}
