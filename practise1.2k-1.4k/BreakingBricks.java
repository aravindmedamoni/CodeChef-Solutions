import java.util.Scanner;

public class BreakingBricks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte s = sc.nextByte();
            byte[] arr = new byte[3];
            byte sum=0;
            for(byte i=0;i<3;i++){
                arr[i] = sc.nextByte();
                sum +=arr[i];
             }
             byte count1=0;
             //byte count2=0;
             if(s>=sum){
                System.out.println(1);
             }else{
                sum=0;
                sum +=arr[0];
                for(byte i=1;i<3;i++){
                    if(sum+arr[i]<=s){
                        sum += arr[i];
                    }else{
                        count1 += (byte)(s<arr[i-1]?2:1);
                        sum =arr[i];
                    }
                }
                if(s<arr[2]){
                    System.out.println(count1+2);
                }else{
                    System.out.println(count1+1);
                }
             }

        }
        sc.close();
    }
}
