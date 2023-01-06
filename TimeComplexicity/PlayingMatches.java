package TimeComplexicity;

import java.util.Scanner;

public class PlayingMatches {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a=a+b;
            int count=0;
            while(a>0){
                byte temp = (byte)(a%10);
                if(temp==1){
                    count +=2;
                }else if(temp==2 || temp == 3 || temp==5){
                    count +=5;
                }else if(temp==0 || temp==6 || temp==9){
                    count +=6;
                }else if(temp == 4){
                    count +=4;
                }else if(temp==7){
                    count +=3;
                }else{
                    count +=7;
                }
                a=a/10;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
