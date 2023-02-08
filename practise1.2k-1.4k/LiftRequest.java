import java.util.Scanner;

public class LiftRequest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int count=0;
            int liftPos=0;
            //boolean flag=true;
            for(int i=0;i<q;i++){
                int s = sc.nextInt();
                int d = sc.nextInt();
                    count +=Math.abs(s-liftPos);
                    // System.out.println("Count1 "+count);
                    count +=Math.abs(s-d);
                    liftPos=d;
                    // System.out.println("Count2 "+count);

            }
            System.out.println(count);
        }
        sc.close();
    }
}
