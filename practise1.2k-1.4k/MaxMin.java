import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int zeroCount=0;
            int oneCount=0;
            for(int i=0;i<n;i++){
                byte val = sc.nextByte();
                if(val==0){
                    zeroCount++;
                }else{
                    oneCount++;
                }
            }
            if(zeroCount>oneCount){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
        sc.close();
    }
}
