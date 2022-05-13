public class CircularTrack {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            long a = ir.nextLong();
            long b = ir.nextLong();
            long m = ir.nextLong();
            long min = Math.abs(b-a);
            System.out.println(Math.min(min, m-min));
        }
    }
}
