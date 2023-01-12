import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int v = sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
               sum += sc.nextInt();
            }
            int res=(n+k)*v-sum;
            if(res%k==0 && res>0){
                System.out.println(res/k);
            }else{
                System.out.println(-1);
            }


        }
        sc.close();
    }
}
