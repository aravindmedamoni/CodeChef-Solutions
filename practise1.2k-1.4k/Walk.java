import java.util.Scanner;

public class Walk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int max=Integer.MIN_VALUE;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            int res=max;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    res +=arr[i]-max;
                    max +=arr[i]-max;
                }
                max--;
            }
            System.out.println(res);
        }
        sc.close();
    }
}