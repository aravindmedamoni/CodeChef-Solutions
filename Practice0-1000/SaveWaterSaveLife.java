
//problem code:SAVWATER
public class SaveWaterSaveLife {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int h = ir.nextInt();
            int x = ir.nextInt();
            int y = ir.nextInt();
            int c = ir.nextInt();
            if((x+y/2)*h<=c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
