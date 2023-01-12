import java.util.Scanner;

public class MaximizeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            char[] arr1 = sc.next().toCharArray();
            char[] arr2 = sc.next().toCharArray();
            int a1zcount=0;
            int b1ocount=0;
            int a2zcount=0;
            int b2ocount=0;
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]=='0')
                a1zcount++;
                else
                b1ocount++;
            }
            for(int i=0;i<arr2.length;i++){
                if(arr2[i]=='0')
                a2zcount++;
                else
                b2ocount++;
            }
            int len = Math.min(a2zcount, b1ocount)+Math.min(a1zcount, b2ocount);
            System.out.println("1".repeat(len)+"0".repeat(arr1.length-len));
        }
        sc.close();
    }
}
