import java.util.Scanner;

public class ChefCoupons {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            byte d = sc.nextByte();
            byte c = sc.nextByte();
            int day1=0;
            int day2=0;
            for(int i=0;i<3;i++){
                day1 +=sc.nextInt();
            }
            for(int i=0;i<3;i++){
                day2 +=sc.nextInt();
            }
            // if(c<d){
            //     System.out.println("YES");
            // }else{
                int withCoupons=0;
                int withoutCoupon=0;
                if(c<d){
                    if(day1>=150 && day2>=150){
                        withCoupons=day1+day2+c;
                    }else if(day1<150 && day2<150){
                        withCoupons=day1+day2+2*d+c;
                    }else{
                        withCoupons = day1+day2+c+d;
                    }
                }else if(c<2*d){
                    if(day1>=150 && day2>=150){
                        withCoupons=day1+day2+c;
                    }else if(day1<150 && day2<150){
                        withCoupons=day1+day2+2*d+c;
                    }else{
                        withCoupons = day1+day2+c+d;
                    }
                }
                    withoutCoupon=day1+day2+(2*d);
            if(withCoupons<withoutCoupon && c<2*d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
