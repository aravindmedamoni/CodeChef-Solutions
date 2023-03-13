import java.util.Scanner;

public class BallFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            while (q-->0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                if(c==l){
                    c=r;
                }else if(c==r){
                    c=l;
                }else{
                    if(c>=l&&c<=r){
                        c = r-(c-l);
                    }
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}
