import java.util.Scanner;

public class ChefMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            long sum=0;
            for(int i=0;i<n;i++){
                sum +=arr[i];
            }
            if(sum%n==0){
                long mean =sum/n;
            long el = sum-mean*(n-1);
            for(int i=0;i<n;i++){
                if(arr[i]==el){
                    System.out.println(i+1);
                    break;
                }
                if(i==n-1){
                    System.out.println("Impossible");
                }
            }
            }else{
                System.out.println("Impossible");
            }
            

        }
        sc.close();
    }
}
