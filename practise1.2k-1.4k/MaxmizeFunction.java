import java.util.Arrays;
import java.util.Scanner;

public class MaxmizeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long sum = Math.abs(arr[0]-arr[1])+Math.abs(arr[n-1]-arr[1])+Math.abs(arr[0]-arr[n-1]);
            System.out.println(sum);
        }
        sc.close();
    }
}
