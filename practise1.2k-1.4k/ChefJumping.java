import java.math.BigInteger;
import java.util.Scanner;

public class ChefJumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if(a%6==0 || a%6==1 || a%6==3){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        // BigInteger a = new BigInteger(sc.next());
        // if(a.mod(BigInteger.valueOf(6)).equals(BigInteger.ONE) || a.mod(BigInteger.valueOf(6)).equals(BigInteger.valueOf(3)) || a.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }
        sc.close();
    }
}
