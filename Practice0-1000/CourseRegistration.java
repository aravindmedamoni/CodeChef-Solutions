
//problem code:COURSEREG
public class CourseRegistration {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int m = ir.nextInt();
            int k = ir.nextInt();
            System.out.println(m-k>=n?"yes":"no");
        }
    }
}
