import java.util.Arrays;
import java.util.Scanner;

public class Watson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag=true;
            for(int i=0;i<n-1;i++){
                if(!(arr[i+1]-arr[i]<=1)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
