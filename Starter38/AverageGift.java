public class AverageGift {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            long x = ir.nextLong();
            long[] s = new long[n];
           
            for(int i=0;i<n;i++){
                s[i] = ir.nextLong();
            }
            long min=s[0];
            long max=s[0];
            for(int i=0;i<n;i++){
                min = Math.min(min, s[i]);
                max = Math.max(max, s[i]);
            }
            if(x>=min && x<=max){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}