import java.util.Scanner;

public class FirstNLast08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            System.out.println(Integer.parseInt(String.valueOf(s.charAt(0)))+Integer.parseInt(String.valueOf(s.charAt(s.length()-1))));
        }
        sc.close();
    }
}
