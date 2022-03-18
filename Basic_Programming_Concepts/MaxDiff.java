import java.util.Scanner;

// problem code:MAX_DIFF
public class MaxDiff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int maxDiff=0;
            for(int j=0;j<=n;j++){
                if(s-j<=n && s-j>=0){
                    int currentMaxDiff = Math.abs(j-(s-j));
                    if(maxDiff<currentMaxDiff){
                        maxDiff = currentMaxDiff;
                    }
                }
            }
            System.out.println(maxDiff);
        }
        sc.close();
    }
}