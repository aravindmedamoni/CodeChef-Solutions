import java.util.Scanner;

public class ChefDemonetisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            int count=0;
            if(s==1){
                System.out.println(++count);
            }else{
                    count +=s/n;
                    s=s%n;
                   if(s==1 ||(s>0&&((s&1)==0))){
                       count +=1;
                   }else if(s>0){
                       count +=2;
                   } 
               System.out.println(count);
            }
            
        }
        sc.close();
    }
}
