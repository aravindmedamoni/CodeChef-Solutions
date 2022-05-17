
//Problem Code:URCALC
public class YourCalculator {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int a = ir.nextInt();
        int b = ir.nextInt();
        char c = ir.next().charAt(0);
        if(c=='+'){
            System.out.println(a+b);
        }else if(c == '-'){
            System.out.println(a-b);
        }else if(c=='*'){
            System.out.println(a*b);
        }else{
            System.out.println(Double.valueOf(a)/Double.valueOf(b));
        }
    }
}
