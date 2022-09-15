
//Problem Code:BOBBANK
public class BobAtBank {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);

        int t = ir.nextInt();
        while(t-->0){
            int w = ir.nextInt();
            int x = ir.nextInt();
            int y = ir.nextInt();
            int z = ir.nextInt();
            System.out.println((x-y)*z+w);
        }
    }
}
