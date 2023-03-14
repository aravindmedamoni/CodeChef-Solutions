import java.util.Scanner;

public class GreedyPuppy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int max = Integer.MIN_VALUE;
            while (k>0) {
                if(n%k>max){
                    max=n%k;
                }
                k--;
            }
            System.out.println(max);
        }
       
        sc.close();
    }
}