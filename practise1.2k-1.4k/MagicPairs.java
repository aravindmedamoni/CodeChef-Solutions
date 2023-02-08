import java.util.Arrays;
import java.util.Scanner;

public class MagicPairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
           // Arrays.sort(arr);
            int count=1;
            for(int i=2;i<n;i++){
                count +=i;
            }
            if(n>1){
                System.out.println(count);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}