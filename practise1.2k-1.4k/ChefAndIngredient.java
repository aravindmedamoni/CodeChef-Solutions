import java.util.Scanner;

public class ChefAndIngredient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            boolean flag = false;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                if(val>=x){
                    flag=true;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}