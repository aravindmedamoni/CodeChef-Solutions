import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            boolean flag=false;
            for(int i=0;i<s1.length();i++){
                if(s2.contains(s1.charAt(i)+"")){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
        sc.close();
    }
}
