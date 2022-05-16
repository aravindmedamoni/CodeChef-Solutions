public class Scholarship {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        long r = ir.nextLong();
        if(r>=1 && r<=50){
            System.out.println(100);
        }else if(r>=51 && r<=100){
            System.out.println(50);
        }else{
            System.out.println(0);
        }
    }
}
