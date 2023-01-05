import java.util.Arrays;
import java.util.Scanner;

public class ChefParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            
            for(int i=0;i<n;i++){
                if(arr[i]<=count){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
