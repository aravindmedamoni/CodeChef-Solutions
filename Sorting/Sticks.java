import java.util.Arrays;

//problem code:STICKS
public class Sticks {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextInt();
            }
            Arrays.sort(a);
            int num1=-1;
            int num2=-1;
            int j=0;
            for(int i=n-1;j<2&&i>0;){
                if(a[i]==a[i-1]){
                    if(j==0){
                        num1=a[i];
                        j++;
                    }else{
                        num2=a[i];
                    }
                    i=i-2;
                }else{
                    i--;
                }
            }
            long area = num1==-1 || num2==-1?-1:num1*num2;
            System.out.println(area);
        }
    }
}
