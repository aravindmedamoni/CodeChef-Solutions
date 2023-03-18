import java.util.Scanner;

public class SortedSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count=0;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                    i++;
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
