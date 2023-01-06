package TimeComplexicity;

import java.util.Scanner;

public class LazySalesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            int w = sc.nextInt();
            byte[] arr = new byte[101];
            for(int i=0;i<n;i++){
                arr[sc.nextByte()]++;
            }
            byte count=0;
            for(int i=100;i>=0;i--){
                if(arr[i]>0){
                    while(w>0 && arr[i]!=0){
                        w = w-i;
                        arr[i]--;
                        count++;
                    }
                }
                if(w<=0)
                break;
            }
            System.out.println(n-count);
        }
        sc.close();
    }
}
