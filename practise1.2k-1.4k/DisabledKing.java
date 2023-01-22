import java.util.Scanner;

public class DisabledKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            if(n%2==1){
                System.out.println(n-1);
            }else{
                System.out.println(n);
            }
        }
        sc.close();
    }
}
