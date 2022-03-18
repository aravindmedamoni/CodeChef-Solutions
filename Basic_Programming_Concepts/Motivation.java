import java.util.Scanner;

//problem code:IMDB
public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int spcae = sc.nextInt();
            int[][] arr = new int[n][2];
            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int maxRating=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i][0]<=spcae && arr[i][1]>maxRating){
                    maxRating = arr[i][1];
                }
            }
            System.out.println(maxRating);
            t--;
        }
        sc.close();
    }
}
