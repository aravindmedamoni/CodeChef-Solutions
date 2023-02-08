import java.util.Scanner;

public class JustLikeMob{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(41255054%23);
        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int count=0;
            boolean flag=false;
            x=(x%(k*n+m));
            // while (count<=x) {
            //     count +=n*(k-1);
            //     if(x>=count+1 && x<=(count+n+m)) 
            //     flag=true;
            //     count +=n+m;
            // }
            if(x>(n*(k-1)) || (x==0 && k==1)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}