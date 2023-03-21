import java.util.Scanner;

public class SplittingCandles {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(k!=0){
                System.out.println(n/k+" "+n%k);
            }else{
                System.out.println(0+" "+n);
            }
        }
        sc.close();
    }
}
