
//problem code:UNCHANGEDOR
public class UnChangingOR {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long count=0;
            for(int i=1;i<=n;i++){
                if((i|(i-1))==((i-1)|(i-2))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
