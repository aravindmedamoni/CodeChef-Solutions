import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
       
        while (t-->0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int risk=0;
            int safe=0;
            if(d==1){
                for(int i=0;i<n;i++)
                sc.nextByte();
                System.out.println(n);
            }else{
                for(int i=0;i<n;i++){
                    byte val = sc.nextByte();
                    if(val<=9 || val>=80)
                    risk++;
                    else
                    safe++;
                }
                int ans=0;
                System.out.println("R "+risk+" S "+safe);
                if(risk%d==0 && safe%d==0){
                    ans =((risk/d)+(safe/d));
                }else if(risk%d!=0 && safe%d!=0){
                    ans =((risk/d+1)+(safe/d+1));
                }else if(risk%d==0 && safe%d!=0){
                    ans =((risk/d)+(safe/d+1));
                }else if(risk%d!=0 && safe%d==0){
                    ans =((risk/d+1)+(safe/d));
                }
            // if((int)(risk&1)!=1 && (int)(safe&1)!=1){
            //     ans += ((risk/2)+(safe/2));
            // }else if((int)(risk&1)==1 && (int)(safe&1)==1){
            //     ans +=((risk/2+1)+(safe/2+1));
            // }else if((int)(risk&1)==1 && (int)(safe&1)!=1){
            //     ans +=((risk/2+1)+(safe/2));
            // }else if((int)(risk&1)!=1 && (int)(safe&1)==1){
            //     ans +=((risk/2)+(safe/2+1));
            // }
            System.out.println(ans);
            }
            
        }
        sc.close();
    }
}
