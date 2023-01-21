import java.util.Arrays;
import java.util.Scanner;

public class EvenSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            char[] chars = sc.next().toCharArray();
            if(chars.length>2){
                Arrays.sort(chars);
            }
            System.out.println(String.valueOf(chars));
        }
        sc.close();
    }
}
