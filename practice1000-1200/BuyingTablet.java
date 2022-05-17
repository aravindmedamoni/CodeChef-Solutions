
//Problem Code:TABLET
public class BuyingTablet {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int b = ir.nextInt();
            long maxArea=0;
            for(int i=0;i<n;i++){
                int w = ir.nextInt();
                int h = ir.nextInt();
                int p = ir.nextInt();
                if(p<=b && maxArea< w*h){
                    maxArea = w*h;
                }
            }
            if(maxArea==0){
                System.out.println("no tablet");
            }else{
                System.out.println(maxArea);
            }
        }
    }
}
