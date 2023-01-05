public class CuttingRecipies {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextInt();
            }
            int maxEle = a[0];
            for(int i=1;i<n;i++){
                if(maxEle<a[i]){
                    maxEle=a[i];
                }
            }
            int i=maxEle;
            for(;i>0;i--){
                boolean allDivisible=true;
                for(int j=0;j<n;j++){
                    if(a[j]%i!=0){
                        allDivisible=false;
                        break;
                    }
                }
                if(allDivisible){
                    break;
                }
            }
            for(int j=0;j<n;j++){
                System.out.print(a[j]/i+" ");
            }
            System.out.println();           
        }
    }
}
