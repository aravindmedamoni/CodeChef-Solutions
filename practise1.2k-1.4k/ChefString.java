import java.util.Scanner;

public class ChefString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            int len = s.length();
            if(len==1 || len==2){
                System.out.println("YES");
            }else{
                String s1 = s.substring(1, len)+s.charAt(0);
                String s2 = s.charAt(len-1)+s.substring(0, len-1);
                if(s1.equals(s2)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
