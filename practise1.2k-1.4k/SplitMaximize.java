import java.util.Scanner;

public class SplitMaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long num=0;
            for(int i=0;i<n;i++){
                num +=sc.nextInt();
                num = num%998244353;
            }
            System.out.println(num*(num-1)%998244353);
        }
        sc.close();
    }
}
