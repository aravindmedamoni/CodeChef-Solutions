import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WeaponValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = {0,0,0,0,0,0,0,0,0,0};
            for(int i=0;i<n;i++){
                char[] chArr = sc.next().toCharArray();
                for(int j=0;j<10;j++){
                    arr[j] = arr[j] ^ (int) chArr[j]-48;
                }
            }
            long res = Arrays.stream(arr).boxed().filter(s->s==1).collect(Collectors.counting());
            System.out.println(res);
            
        }
        sc.close();
    }
}
