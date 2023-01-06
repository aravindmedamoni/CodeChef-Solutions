package TimeComplexicity;

import java.util.Scanner;

public class ICPCBaloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            byte n = sc.nextByte();
            byte count=0;
            byte j=0;
            for(byte i=0;i<n;i++){
                //byte b =
                if(sc.nextByte()<=7 && count<7){
                    count++; 
                }
                j++;
                if(count==7){
                    for(;i<n-1;i++){
                        sc.nextByte();
                    }
                    break;
                }
                
            }
            System.out.println(j);   
        }
        sc.close();
    }
}
