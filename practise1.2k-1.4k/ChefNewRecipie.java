import java.util.Arrays;
import java.util.Scanner;

public class ChefNewRecipie {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long ans=0;
            if(arr[0]<2){
                System.out.println(-1);
            }else{
                ans = 2;
                for(int i=1;i<n;i++){
                    ans +=arr[i];
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
