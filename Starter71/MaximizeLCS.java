package Starter71;

import java.util.Scanner;

public class MaximizeLCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int pos = n/2;
            String AliceS = s.substring(0, pos);
            String BobS= String.valueOf(new StringBuffer(s.substring(pos, n)).reverse());
            int count=0;
            for(int i=0;i<AliceS.length();i++){
                int j=BobS.indexOf(AliceS.charAt(i));
                if(j>-1){
                    BobS = BobS.substring(j);
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
