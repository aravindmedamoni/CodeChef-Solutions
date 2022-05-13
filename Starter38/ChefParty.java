public class ChefParty {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int x = ir.nextInt();
            int k = ir.nextInt();
            if(n*x>k){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
