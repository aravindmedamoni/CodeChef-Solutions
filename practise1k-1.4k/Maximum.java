import java.util.Scanner;

public class Maximum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count=s.charAt(n-2)=='0'?1:0;
            char[] arr = s.toCharArray();
            char last='0';
            for(char ch:arr){
                if(last=='0' && ch=='1'){
                    count++;
                }
                last=ch;
            }
            System.out.println(count);
        //     boolean flag=true;
        //     boolean remStr = false;
        //     if(s.charAt(n-2)=='0' && s.charAt(0)=='1'){
        //         count=2;
        //         s=s.substring(1, n-2);
        //        // System.out.println(s);
        //         flag=false;
        //     }

        //     while(s.contains("01")){
        //         count++;
        //         int index =s.indexOf("01");
        //         // System.out.println("index "+index);
        //         // System.out.println("count "+count);
        //         s = s.substring(index+2);
        //         flag=false;
        //         remStr=true;

        //     }
        //     if(remStr && s.length()>0){
        //         if(s.length()==1 && s =="0"){
        //             count++;
        //         }else if(s.startsWith("10")){
        //             //System.out.println("String "+s);
        //             count +=2;
        //         }
        //     }
        //     if(flag){
        //         System.out.println(1);
        //     }else{
        //         System.out.println(count);
        //     }
            
        // }
        }
        sc.close();
    }
}