import java.util.Scanner;

public class PalindromicNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long count=0;
            for(int i=l;i<=r;i++){
                if(isPalin(String.valueOf(i)))
                count +=i;
            }
            System.out.println(count);
        }
        sc.close();
    }

    static boolean isPalin(String s){
        return s.equals(new StringBuffer(s).reverse().toString());
    }
}
