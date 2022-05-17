public class ElectionsChefland {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int[] a = new int[3];
            for(int i=0;i<3;i++){
                a[i] = ir.nextInt();
            }
            int i=0;
            for(;i<3;i++){
                if(a[i]>50){
                    break;
                }
            }
            if(i==0){
                System.out.println("A");
            }else if(i==1){
                System.out.println("B");
            }else if(i==2){
                System.out.println("C");
            }else{
                System.out.println("NOTA");
            }
        }
    }
}
