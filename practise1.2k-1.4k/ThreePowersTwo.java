import java.util.Scanner;

public class ThreePowersTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            if(count>=4|| count==1&&n<3){
                System.out.println("NO");
            }else{
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
