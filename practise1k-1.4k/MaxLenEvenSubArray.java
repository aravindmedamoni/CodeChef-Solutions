import java.util.Scanner;

public class MaxLenEvenSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                if((i&1)==1){
                    count++;
                }
            }
            if((count&1)==1){
                if((n&1)==1){
                    System.out.println(n-1);
                }else{
                    System.out.println(n-2);
                }
            }else{
                System.out.println(n);
            }
        }
        sc.close();
    }
}
