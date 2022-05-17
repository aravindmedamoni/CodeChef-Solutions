
//Problem Code:CANDY123
public class BearsCandies {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int a = ir.nextInt();
            int b = ir.nextInt();
            int i=1;
            int aCount=1;
            int bCount=2;
            while(true){
                if(aCount>a){
                    System.out.println("Bob");
                    break;
                }
                
                aCount = aCount+(i+2);
                i++;
                if(bCount>b){
                    System.out.println("Limak");
                    break;
                }
                bCount = bCount+(i+2);
                i++;
            }
        }
    }
}
