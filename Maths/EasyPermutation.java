
//Problem Code:EASYPERM
public class EasyPermutation {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n= ir.nextInt();
            for(int i=n;i>=1;i--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
