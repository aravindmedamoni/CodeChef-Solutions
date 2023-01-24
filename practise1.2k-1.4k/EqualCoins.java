import java.util.Scanner;

public class EqualCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            if((a1%2==0 && a2%2==0) || ((a1>0 && a2>0) && (a1+2)%2==0)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
