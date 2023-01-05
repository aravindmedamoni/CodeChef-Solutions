//Problem Code:AIRLINE
public class AirlineRestrictions {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t  = ir.nextInt();
        while(t-->0){
            int a = ir.nextInt();
            int b = ir.nextInt();
            int c = ir.nextInt();
            int d = ir.nextInt();
            int e = ir.nextInt();
            if(a+b<=d && c<=e){
                System.out.println("Yes");
            }else if(a+c<=d && b<=e){
                System.out.println("Yes");
            }else if(b+c<=d && a<=e){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    } 
}
