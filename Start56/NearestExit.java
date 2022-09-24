
//Problem Code:NEARESTEXIT
public class NearestExit {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int x = ir.nextInt();
            if(x-1<100-x){
                System.out.println("Left");
            }else{
                System.out.println("Right");
            }
        }
    }
}
