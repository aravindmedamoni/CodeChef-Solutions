import java.util.Scanner;

//problem code:VDATES
public class VaccineDate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int D = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(D>=L && D<=R){
                System.out.println("Take second dose now");
            }else if(D<L){
                System.out.println("Too Early");
            }else{
                System.out.println("Too Late");
            }
        }
        sc.close();
    }
}