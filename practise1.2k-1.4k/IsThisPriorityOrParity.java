import java.util.Scanner;

public class IsThisPriorityOrParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(((n&1)==1 & k==1) || k==2){
                System.out.println("ODD");
            }else{
                System.out.println("EVEN");
            }
        }
        sc.close();
    }
}
