package Starter71;

import java.util.Scanner;

public class Instagram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>10*y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
