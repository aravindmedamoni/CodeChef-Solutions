import java.math.BigInteger;
import java.util.Scanner;

public class SingleOperator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int pos=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)!='0'){
                    pos++;
                }else{
                    break;
                }
            }
            System.out.println(pos);
        }
        sc.close();
    }
}
