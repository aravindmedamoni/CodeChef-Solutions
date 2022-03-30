
//problem code:THREETOPICS
public class ThreeTopics {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int a = ir.nextInt();
        int b = ir.nextInt();
        int c = ir.nextInt();
        int x = ir.nextInt();
        if(x==a || x==b || x==c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
