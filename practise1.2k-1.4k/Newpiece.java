import java.util.Scanner;

public class Newpiece {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        while (t-->0) {
            byte a = sc.nextByte();
            byte b = sc.nextByte();
            byte p = sc.nextByte();
            byte q = sc.nextByte();
            byte f = Byte.valueOf(String.valueOf((a+b)&1));
            byte l = Byte.valueOf(String.valueOf((p+q)&1));
            if((a==b && p==q && a==p) || (a==p && b==q)){
                System.out.println(0);
            }else if((f==1 && l==0) || f==0 && l==1){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
        sc.close();
    }
}
