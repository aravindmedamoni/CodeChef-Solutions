import java.util.Arrays;
import java.util.Scanner;

public class DoubledDistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            boolean flag=true;
            Arrays.sort(arr);
            for(int i=1;i<n-1;i++){
                if((arr[i]-arr[i-1])*2!=arr[i+1]-arr[i] && arr[i]-arr[i-1]!=(arr[i+1]-arr[i])*2){
                    flag=false;
                    //System.out.println("coe");
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
