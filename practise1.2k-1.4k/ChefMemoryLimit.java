import java.util.Scanner;

public class ChefMemoryLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int totalMem=0;
            int num=sc.nextInt();
            totalMem=num;
            for(int i=1;i<n;i++){
                int val=sc.nextInt();
                if(num<val){
                    totalMem +=val-num;
                }
                num=val;
            }
            System.out.println(totalMem);
        }
        sc.close();
    }
}
