import java.util.Scanner;

public class OddRepeat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long s = sc.nextLong();
            int j=1;
            for(int i=0;i<n-1;i++){
                s -=j;
                j +=2;
            }
            long res = s/k;
            System.out.println(res);
        }
        sc.close();
    }
}