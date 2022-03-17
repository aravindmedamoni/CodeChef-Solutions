import java.util.Scanner;

public class LuckFour09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int m = sc.nextInt();
            int count=0;
            int rem;
            while(m>0){
                rem = m%10;
                m = m/10;
                if(rem==4) count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
