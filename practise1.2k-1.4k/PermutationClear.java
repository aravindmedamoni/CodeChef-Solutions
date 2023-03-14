import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationClear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k = sc.nextInt();
            Set<Integer> arr2 = new LinkedHashSet<>(k);
            for(int i=0;i<k;i++){
               arr2.add(sc.nextInt());
            }
            Arrays.stream(arr).filter(ele->!arr2.contains(ele)).forEach(ele->System.out.print(ele+" "));
        }
        sc.close();
    }
}
