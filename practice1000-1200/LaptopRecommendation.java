import java.util.Arrays;

//problem code:LAPTOPREC
public class LaptopRecommendation {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextInt();
            }
            Arrays.sort(a);
            int firstCount=1;
            int firstMaxCount=0;
            int secondMaxCount=0;
            int start=0;
            int end=n-1;
            int firstEle=a[start];
            while(start<end){
                if(a[start]==a[start+1]){
                    firstCount++;
                    start++;
                }else{
                    if(firstMaxCount == firstCount){
                        secondMaxCount = firstMaxCount;
                    }
                    if(firstMaxCount<firstCount){
                        firstEle=a[start];
                        firstMaxCount = firstCount;
                    }
                    firstCount=1;
                    start++;
                }
                
            }
            if(firstMaxCount == firstCount){
                secondMaxCount = firstMaxCount;
            }
            if(firstMaxCount<firstCount){
                firstEle = a[start];
                firstMaxCount = firstCount;
            }
            if(firstMaxCount==secondMaxCount){
                System.out.println("Confused");
            }else{
                System.out.println(firstEle);
            }
        }
    }
}
