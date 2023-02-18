import java.util.Scanner;

public class SplitString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            String s = sc.next();
            String ans="NO";
            for(int i=0;i<n-1;i++){
                if(s.charAt(n-1)==s.charAt(i)){
                    ans="YES";
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}