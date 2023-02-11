import java.util.Scanner;

public class AvoidFixedPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long count=0;
            int val=1;
            for(int i=0;i<n;i++){
                if(arr[i]==val){
                    count++;
                    val +=2;

                }else{
                    val++;
                }

            }
            System.out.println(count);
        }
        sc.close();
    }
}
