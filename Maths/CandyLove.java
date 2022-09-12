
//Problem Code:CNDLOVE
public class CandyLove {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                sum += ir.nextInt();
            }
            int b= sum&1; 
            if(b==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
