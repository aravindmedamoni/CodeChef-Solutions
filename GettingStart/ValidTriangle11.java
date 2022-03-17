import java.util.Scanner;

public class ValidTriangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int sum = sc.nextInt()+sc.nextInt()+sc.nextInt();
            if(sum==180){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
