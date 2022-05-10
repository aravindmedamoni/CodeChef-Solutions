
//problem code:DIET
public class ChefDiet {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int k = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextInt();
            }
            int grams=0;
            boolean isEnough=true;
            for(int i=0;i<n;i++){
                grams +=a[i];
                if(grams-k<0){
                   System.out.println("No "+(i+1));
                   isEnough=false;
                   break;
                }else{
                    grams -=k;
                }
            }
            if(isEnough){
                System.out.println("Yes");
            }
        }
    }
}
