import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DrumpsPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k= sc.nextInt();
            int[] inArr = new int[n];
            int[] resArr = new int[n+1];
            Set<Integer> s = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                inArr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(inArr[i]!=i+1 && !s.contains(Integer.valueOf(inArr[i]))){
                    resArr[inArr[i]]++;
                }else{
                    s.add(Integer.valueOf(inArr[i]));
                    resArr[inArr[i]]=0;
                }
            }
            int count=0;
            for(int i=1;i<=n;i++){
                if(resArr[i]>=k){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
