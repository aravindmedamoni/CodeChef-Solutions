//problem code:NUM239
public class CountPrettyNums {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int L = ir.nextInt();
            int R = ir.nextInt();
            int count=0;
            //METHOD-2: Optimised solution.
            int div = R/10;
            int rem = R%10;
            if(L==R &&(L==2 || L==3 || L==9)){
                count=1;
            }
            else{
            if(rem==9){
                count = div*3+3;
            }else if(rem>=3){
                count = div*3+2;
            }else if(rem>=2){
                count = div*3+1;
            }else{
                count = div*3;
            }
            div = L/10;
            rem = L%10;
            if(rem>9){
                count =count-(div*3+3);
            }else if(rem>3){
                count = count-(div*3+2);
            }else if(rem>2){
                count = count-(div*3+1);
            }else{
                count = count-div*3;
            }
            }
            
            // Method-1: brute force
            // while(L<=R){
            //     if(L%10==2 || L%10==3 || L%10==9){
            //         count++;
            //     }
            //     L++;
            // }
            // System.out.println(count);
        }
        
    }
}
