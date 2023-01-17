import java.util.Scanner;

public class Russ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
               if(Math.abs(arr1[i]-arr2[i])<=k){
                count++;
               }
            }
            if(count>=x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}