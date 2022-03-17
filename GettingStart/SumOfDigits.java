import java.util.Scanner;

public class SumOfDigits {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       while(n-->0){
           int sum=0;
           String s = sc.next();
           for(int i=0;i<s.length();i++){
               sum += Integer.parseInt(String.valueOf(s.charAt(i)));
           }
           System.out.println(sum);
       }
   } 
}
