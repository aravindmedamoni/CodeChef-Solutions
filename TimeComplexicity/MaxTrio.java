import java.util.Scanner;

public class MaxTrio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            long firstMax=sc.nextLong();
            long secMax=0;
            long min=firstMax;
            for(int i=0;i<n-1;i++){
                long val= sc.nextLong();
                if(val>=secMax){
                    secMax=val;
                }
                if(val>=firstMax){
                    secMax=firstMax;
                    firstMax=val;
                }
                if(val<min)
                min=val;
            }
            //System.out.println("Max :"+firstMax+" SMax :"+secMax+" min :"+min);
            System.out.println((firstMax-min)*secMax);
            //System.out.println((secMax-min)*firstMax);
        }
        sc.close();
    }
}
