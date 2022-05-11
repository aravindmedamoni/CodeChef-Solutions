
//problem code:QUEENATTACK
public class QueenAttack {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int x = ir.nextInt();
            int y = ir.nextInt();
            int start=1;
            int end=n;
            int sum=end*2-2;
            if((x==start || x==end) || (y==start || y==end)){
                sum +=end-1;
            }else {
                int minX = Math.min(end-x,x-1);
                int minY = Math.min(end-y, y-1);

                int min = Math.min(minX,minY);
                sum += (end-1)+(min)*2;
            }
            System.out.println(sum);
        }
    }
}
