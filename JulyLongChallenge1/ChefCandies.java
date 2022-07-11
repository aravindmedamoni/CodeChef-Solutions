//Problem Code:CHEFCAND
public class ChefCandies {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int x = ir.nextInt();
            if(n<=x){
                System.out.println(0);
            }else{
                int need = n-x;
                int rem= need/4 + (need%4!=0 ? 1 : 0);
                System.out.println(rem);
            }
        }
    }
}
