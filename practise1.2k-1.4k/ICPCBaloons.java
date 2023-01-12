import java.util.Scanner;

public class ICPCBaloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
           int n =sc.nextInt();
           int count=7;
           int res=0;
           for(int i=0;i<n;i++){
                if(sc.nextInt()<=7){
                    count--;
                }
                res++;
                if(count==0){
                    break;
                }
           }
           if(res<n){
            for(int i=0;i<n-res;i++){
                sc.nextInt();
            }
           }
           System.out.println(res);
        }
        sc.close();
    }
}
