
//problem code:SIGNMOVE
public class SignMoves {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long n = ir.nextLong();
            long pos=0;
            for(long i=1;i<=n;i++){
                if(pos>=0){
                    pos -=i;
                }else{
                    pos +=i;
                }
            }
            System.out.println(pos);
        }
    }

    public static long findPos(long n){
        long pos=0;
        if(n%2==0){
            pos = n/2;
        }else{
            pos = -(n+1)/2;
        }
        return pos;
    }
}
