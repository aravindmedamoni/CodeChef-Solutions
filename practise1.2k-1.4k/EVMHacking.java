import java.util.Scanner;

public class EVMHacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            byte a = sc.nextByte();
            byte b = sc.nextByte();
            byte c = sc.nextByte();
            byte p = sc.nextByte();
            byte q = sc.nextByte();
            byte r = sc.nextByte();
            byte max=0;
            int sum=0;
            byte i=0;
            if(p-a>max){
                max=(byte)(p-a);
                sum=p+b+c;
                i=1;
                // sum +=(b+c);
                // if(sum>((p+q+r)/2))
                // System.out.println("YES");
            }
            if(q-b>max){
                max=(byte)(q-b);
                sum=q+a+c;
                i=2;
            }
            if(r-c>max){
                max=(byte)(r-c);
                sum=r+a+b;
                i=3;
            }
            if(i==1&&sum>((p+q+r)/2)){
                System.out.println("YES");
            }else if(i==2&&sum>((p+q+r)/2)){
                System.out.println("YES");
            }else if(i==3&&sum>((p+q+r)/2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
