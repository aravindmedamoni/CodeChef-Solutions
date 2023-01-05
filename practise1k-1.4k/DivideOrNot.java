import java.util.Scanner;

public class DivideOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            while(true && a!=b){
                if(n%a==0){
                    if(n%b!=0)
                    break;
                    else{
                        n+=a;
                    }
                }else{
                    n +=a-(n%a);
                }
            }
            if(a==b){
                System.out.println(-1);
            }else{
                System.out.println(n);
            }
            
        }
        sc.close();
    }
}
