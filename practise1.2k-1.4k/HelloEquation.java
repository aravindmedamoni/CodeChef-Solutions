import java.util.Scanner;

public class HelloEquation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int x = sc.nextInt();
            int xsqrt = (int)Math.sqrt(x);
            String ans = "No";
            for(int i=1;i<=xsqrt;i++){
                if((x-(2*i)>0)&&(((x-(2*i))%(2+i))==0)){
                    ans="Yes";
                    break;
                }
            }
            System.out.println(ans);
            
        }
        sc.close();
    }
}
