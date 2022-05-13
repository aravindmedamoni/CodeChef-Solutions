public class DominantArmy {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int a = ir.nextInt();
            int b = ir.nextInt();
            int c = ir.nextInt();
            int max = Math.max(a, b);
            max = Math.max(max, c);
            if(max>=a+b || max>=a+c || max>=b+c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
