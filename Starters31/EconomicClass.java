
//problem code:ECOCLASS
public class EconomicClass {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int[] s = new int[n];
            int[] d = new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                s[i] = ir.nextInt();
            }
            for(int i=0;i<n;i++){
                d[i] = ir.nextInt();
            }
            for(int i=0;i<n;i++){
                if(s[i]==d[i])
                count++;
            }
            System.out.println(count);
        }
    }
}
