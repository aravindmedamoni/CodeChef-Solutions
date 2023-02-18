import java.util.Scanner;

public class ChefWildCardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            String x = sc.next();
            String y = sc.next();
            String ans="Yes";
            for(int i=0;i<x.length();i++){
                if(!((x.charAt(i)==y.charAt(i)) || (x.charAt(i)=='?') || (y.charAt(i)=='?'))){
                    ans="No";
                    break;
                }
                
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
