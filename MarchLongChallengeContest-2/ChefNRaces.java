
//problem code:CHEFRACES
public class ChefNRaces {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int x = ir.nextInt();
            int y = ir.nextInt();
            int a = ir.nextInt();
            int b = ir.nextInt();
            int count=0;
            if((a!=x && a!=y)){
                count++;
            }
            if((b!=x && b!=y))
            count++;
            System.out.println(count);
        }
    }
}
