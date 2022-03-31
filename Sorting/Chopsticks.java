import java.util.Arrays;

//problem code:TACHSTCK
public class Chopsticks {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int n = ir.nextInt();
        long d = ir.nextLong();
        long[] l = new long[n];
        for(int i=0;i<n;i++){
            l[i] = ir.nextLong();
        }
        Arrays.sort(l);
        int count=0;
        for(int i=0;i<n-1;){
            if(l[i+1]-l[i]<=d){
                count++;
                i = i+2;
            }else{
                i++;
            }
        }
        System.out.println(count);
    }
}
