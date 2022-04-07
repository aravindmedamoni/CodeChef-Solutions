
//problem code:UWCOI21A
public class HiddenNums{
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long n = ir.nextLong();
            if(n%2==0){
                System.out.println(2+" "+n/2);
            }else{
                System.out.println(1+" "+n);
            }
        }
    }
}