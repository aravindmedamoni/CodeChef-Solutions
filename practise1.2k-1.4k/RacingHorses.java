import java.util.Arrays;
import java.util.Scanner;

public class RacingHorses {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            byte t = sc.nextByte();
            while (t-->0) {
                int n = sc.nextInt();
                long[] arr = new long[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextLong();
                }
                Arrays.sort(arr);
                // long firstMin=;
                // long secondMin=Long.MAX_VALUE;
                // for(int i=1;i<n;i++){
                //     long k = sc.nextLong();
                //     if(k<firstMin){
                //         secondMin=firstMin;
                //         firstMin=k;
                //     }else if(k<secondMin){
                //         secondMin=k;
                //     }
                // }
                long min=Long.MAX_VALUE;
                for(int i=1;i<n;i++){
                    if(arr[i]-arr[i-1]<min){
                        min=arr[i]-arr[i-1];
                    }
                }
                System.out.println(min);
            }
            sc.close();
        }
}
