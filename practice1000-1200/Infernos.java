public class Infernos {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int x = ir.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = ir.nextInt();
            }
            int max = findMax(a);
            int count=0;
            for(int i=0;i<n;i++){
                while(a[i]>0){
                    a[i] = a[i]-x;
                    count++;
                }
            }
            if(max<count){
                System.out.println(max);
            }else{
                System.out.println(count);
            }

        }
    }
    public static int findMax(int[] a){
        int max = a[0];
        for(int i:a){
            max = Math.max(max, i);
        }
        return max;
    }
}
