import java.util.Scanner;

public class Laddu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t-->0) {
            byte n = sc.nextByte();
            String res = sc.next();
            sc.nextLine();
            int count=0;
            for(byte i=0;i<n;i++){
                String s = sc.nextLine();
               // System.out.println(s);
                String[] arr = s.split(" ");
                // for(int j=0;j<arr.length;j++){
                //     System.out.print(arr[j]+" ");
                // }
                // System.out.println();
                if(arr[0].equals("CONTEST_WON")){
                    int rank = Integer.valueOf(arr[1]);
                    count +=300;
                    count +=(20-rank)>0?20-rank:0;
                    // System.out.println(count);
                    // System.out.println("won");
                }
                else if(arr[0].equals("TOP_CONTRIBUTOR")){
                    count +=300;
                    //System.out.println("top");
                    
                } 
                else if(arr[0].equals("BUG_FOUND")){
                    int severity = Integer.valueOf(arr[1]);
                    count +=severity;
                    //System.out.println("bug");
                }
                else{
                    // (arr[0].equals("CONTEST_HOSTED")){
                    count +=50;
                    //System.out.println("host");
                }
            }
            System.out.println(count);
            if(res.equals("INDIAN")){
                System.out.println(count/200);
            }else{
                System.out.println(count/400);
            }
        }
        sc.close();
    }
}
