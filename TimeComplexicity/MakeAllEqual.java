package TimeComplexicity;

import java.util.Arrays;
import java.util.Scanner;

public class MakeAllEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int max=1;
            int num=arr[0];
            int count=1;
            for(int i=1;i<n;i++){
                int val=arr[i];
                if(num==val){
                    count++;
                }
                if(num !=val || i==n-1){
                    if(count>max){
                        max=count;
                        
                    }
                    count=1;
                    num=val;
                }
            }
            System.out.println(n-max);
        }
        sc.close();
    }
}
