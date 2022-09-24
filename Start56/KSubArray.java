//Problem Code:KSUB
public class KSubArray {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n = ir.nextInt();
            int k = ir.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = ir.nextInt();
            }
            int G = arrGcd(arr);
            System.out.println(G);
            int kCount=0;
            for(int i=0,j=i;i<n && j<n;){
                int g = arr[i];
                while(j<n){
                    g = gcd(g, arr[j]);
                   // System.out.println("g: "+g);
                    if(g==G){
                        j++;
                        i=j;
                        kCount++;
                        if(kCount==k){
                            j=n;
                            
                        }
                        break;
                    }else{
                        j++;
                        
                    }
                    
                }
            }
            System.out.println(k==kCount?"yes":"No");
        }
    }

    public static int arrGcd(int arr[]){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result = gcd(result,arr[i]);
            if(result==1){
                return result;
            }
        }
        return result;
    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

}
