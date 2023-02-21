import java.util.Arrays;
import java.util.Scanner;

public class ChefAppleTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.stream(arr).distinct().count());
        }
        sc.close();

    }
}
