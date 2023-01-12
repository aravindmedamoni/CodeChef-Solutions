import java.util.Scanner;

public class CokkingMachine {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        while (t-->0) {
            count=0;
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==b){
                System.out.println(0);
            }else{
                
                if(b%a==0){
                    while(a!=b){
                        a *=2;
                        count++;
                    }
                }else{
                    a=getNum(a, b);
                    while(a!=b){
                        a *=2;
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }

    static long getNum(long a, long b){
        if(b%a==0){
            return a;
        }
        if((a&1)==1){
            count++;
            return getNum((a-1)/2,b);
        }else{
            count++;
            return getNum(a/2, b);
        }
    }
}
