import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double wAmount = sc.nextDouble();
        double accountBal = sc.nextDouble();
        if(wAmount %5 ==0 && wAmount+0.50 <= accountBal){
            accountBal = accountBal-(wAmount+0.50);
            System.out.println(String.format("%.2f", accountBal));
        }else{
            System.out.println(String.format("%.2f", accountBal));
        }
        sc.close();
    }
}
