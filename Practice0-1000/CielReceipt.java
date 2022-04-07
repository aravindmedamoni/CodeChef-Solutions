
//problem code:CIELRCPT
public class CielReceipt {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int[] price = {1,2,4,8,16,32,64,128,256,512,1024,2048};
        int t = ir.nextInt();
        while(t-->0){
            int p = ir.nextInt();
            int minMenus=0;
            for(int i=11;i>=0&&p>0;){
                if(p>=price[i]){
                    if(p%price[i]==0){
                        minMenus +=p/price[i];
                        p=0;
                    }else{
                        minMenus +=p/price[i];
                        p=p-price[i];
                        i--;
                    }
                }else{
                  i--;  
                }
            }
            System.out.println(minMenus);
        }
        
    }
}
