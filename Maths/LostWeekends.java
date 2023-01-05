
//Problem Code:LOSTWKND
public class LostWeekends {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int sum=0;
            for(int i=0;i<5;i++){
                sum += ir.nextInt();
            }
            if(sum*ir.nextInt()>120){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
}
