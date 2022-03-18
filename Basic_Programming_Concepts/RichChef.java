import java.util.Scanner;

//problem code: CHFRICH
public class RichChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((b-a)/x);
            t--;
        }
        sc.close();
    }
}
