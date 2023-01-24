import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
                int n = sc.nextInt();
                int min=sc.nextInt();
                int max=min;
                boolean flag=true;
                for(int i=1;i<n;i++){
                    int val=sc.nextInt();
                    if(val<=min || val>=max){
                        if(val<=min)
                        min=val;
                        else
                        max=val;
                    }else{
                        flag=false;
                        for(;i<n-1;i++)
                        sc.nextInt();
                    }
                }
                if(flag){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
        }
        sc.close();
    }
}
