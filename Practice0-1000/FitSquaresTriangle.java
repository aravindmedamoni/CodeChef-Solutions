//problem code:TRISQ
public class FitSquaresTriangle {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int b = ir.nextInt();
            if(b<4){
                System.out.println(0);
            }else{
                int n = (b-4)/2+1;
                n = (n*(n+1))/2;
                System.out.println(n);
            }
        }
    }
}
