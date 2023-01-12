import java.util.Scanner;

public class VCS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            byte m = sc.nextByte();
            byte k = sc.nextByte();
            byte[] sq1 = new byte[n+1];
            for(byte i=0;i<m;i++){
                sq1[sc.nextByte()]++;
            }
            for(byte i=0;i<k;i++){
                sq1[sc.nextByte()]++;
            }
            byte res1=0;
            byte res2=0;
            for(int i=1;i<=n;i++){
                if(sq1[i]>1)
                res1++;
                if(sq1[i]==0)
                res2++;
            }
            System.out.println(res1+" "+res2);
            


        }
        sc.close();
    }
}
