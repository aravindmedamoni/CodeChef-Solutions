
//problem code:MINCOINS
public class MinNumberCoins {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int x = ir.nextInt();
            int count=0;
            if(x%10==0){
               count=x/10;
            }else if((x%10)%5==0){
                count = x/10;
                x=x%10;
                count +=x/5;
            }else{
                count=-1;
            }
            System.out.println(count);
        }
    }
}
