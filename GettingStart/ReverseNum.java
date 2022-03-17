import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            for(int i=0;i<n;i++){
                String s = String.valueOf(sc.nextInt());
                StringBuilder sb = new StringBuilder(s);
                System.out.println(Integer.parseInt(sb.reverse().toString()));     
            }
            // int num = sc.nextInt();
            // //int num = Integer.parseInt(bi.readLine());
            // int output = 0;
            // int size = String.valueOf(num).length();
            
            // for(int n=size-1; n>=0; n--){
            
            // int q = (int)(num/Math.pow(10, n));
            // output +=  q * Math.pow(10, size-n-1);
            
            // num = num % (int)Math.pow(10, n);
            
            // }
            // System.out.println(output);
            
            // }
        sc.close();
    }
}
