//Problem Code:PASSTHEEXAM
public class ExamPass {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int A=ir.nextInt();
            int B = ir.nextInt();
            int C = ir.nextInt();
            if(A>=10 && B>=10 && C>=10 && A+B+C>=100){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
        }
    }
}
