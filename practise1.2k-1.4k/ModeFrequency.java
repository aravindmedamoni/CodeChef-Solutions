import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ModeFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int[] arr = new int[11];
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                arr[sc.nextInt()]++;
            }
            Arrays.sort(arr);
            int[] arr2 = new int[arr[10]+1];
            for(int i=0;i<11;i++){
                if(arr[i]>0){
                    arr2[arr[i]]++;
                }
            }
            int mod=1;
            int max=arr2[1];
            // for(int i=0;i<arr2.length;i++){
            //     System.out.print(arr2[i]+" ");
            // }
            for(int i=2;i<arr2.length;i++){
                if(max<arr2[i]){
                    max=arr2[i];
                    mod=i;
                }
            }
            System.out.println();
            System.out.println(mod);
        }
        sc.close();
    }
}