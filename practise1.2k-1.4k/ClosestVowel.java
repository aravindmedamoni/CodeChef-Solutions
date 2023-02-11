import java.util.Scanner;

public class ClosestVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count=0;
            for(int i=0;i<n;i++){
               if(s.charAt(i)=='c' || s.charAt(i)=='g' || s.charAt(i)=='l' || s.charAt(i)=='r')
                count++;
            }
            int count2=count/2;
            long num =(long)(((Math.pow(2, count2)%1000000007)*(Math.pow(2,count-count2)%1000000007))%1000000007);
            // BigInteger b = new BigInteger(2+"");

            // b=b.pow(100000);
            // b=b.remainder(BigInteger.valueOf(1000000007));
            System.out.println(num);
        }
        sc.close();
    }
}
