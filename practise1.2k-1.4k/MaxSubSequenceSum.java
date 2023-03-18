import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxSubSequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<k;i++){
                if(arr[i]<0)
                arr[i] = arr[i]*(-1);
            }
            long sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]>0)
                sum +=arr[i];
            }
            System.out.println(sum);
            // if(arr2.size()==0 || k==0){
            //     for(int i=0;i<arr.size();i++){
            //         sum +=arr.get(i);
            //     }
            // }else{
            //     for(int i=0;i<arr.size();i++){
            //         sum +=arr.get(i);
            //         // if(i<k){
            //         //     sum +=arr2.get(i)*(-1);
            //         // }
            //     }
            //     for(int i=0;i<k;i++){
            //         sum +=arr2.get(i)*(-1);
            //     }
            // }
            
        }
        sc.close();
    }
}
