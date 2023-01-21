import java.util.Scanner;

public class Brackets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            long max_balance = getMax(s);
            long i=0;
            for(;i<max_balance;i++){
                System.out.print('('+"");
            }
            for(;i>0;i--){
                System.out.print(')'+"");
            }
            System.out.println();
        }
        sc.close();
    }
    static long getMax(String s){
        long max_balance=0;
        long balance = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            balance++;
            else
            balance--;
            max_balance = Math.max(max_balance, balance);
        }
        return max_balance;
    }

}
