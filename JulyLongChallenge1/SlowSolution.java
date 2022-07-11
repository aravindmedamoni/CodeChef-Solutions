
//Problem Code:SLOWSOLN
public class SlowSolution {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int maxT = ir.nextInt();
            int maxN = ir.nextInt();
            int sumN = ir.nextInt();
            long iterations=0;
            if(maxT*maxN > sumN){
                int n = sumN/maxN;
                while(n-->0){
                    iterations +=maxN*maxN;
                }
                if(sumN%maxN!=0){
                    int rem = sumN%maxN;
                    iterations +=rem*rem;
                }
            }else{
               while(maxT-->0){
                iterations +=maxN*maxN;
               } 
            }
            System.out.println(iterations);
        }
    }
}
