import java.util.Scanner;

public class ChefAparment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            int n = sc.nextInt();
            byte val = sc.nextByte();
            int count=0;
            boolean flag=false;
            if(val==0){
                count=1100;
                flag=true;
            }else{
                count=0;
            }
            for(int i=1;i<n;i++){
                if(sc.nextByte()==0){
                    count +=1100;
                    flag=true;
                }else{
                    if(flag)count +=100;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
