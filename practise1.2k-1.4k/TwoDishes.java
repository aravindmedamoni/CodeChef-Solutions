import java.util.Scanner;

public class TwoDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int ans=0;
            if(n>=s){
                ans=s;
            }else{
                ans=n-(s-n);
            }
            System.out.println(ans);
            
        }
        sc.close();
    }
}
