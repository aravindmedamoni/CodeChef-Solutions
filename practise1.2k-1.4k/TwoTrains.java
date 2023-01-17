import java.util.Scanner;

public class TwoTrains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            long totalTime=arr[0];
            int waitTime=arr[0];
            for(int i=0;i<n-1;i++){
                if(waitTime<arr[i]){
                    totalTime +=arr[i]+arr[i]-waitTime;
                    waitTime +=arr[i]-waitTime;
                }else{
                    totalTime +=arr[i];
                }
            }
            System.out.println(totalTime);
        }
        sc.close();
    }
}
