package Starter71;

import java.util.Scanner;

public class Snapchat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] chef = new int[n];
            int[] chefina = new int[n];
            for(int i=0;i<n;i++){
                chef[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                chefina[i] = sc.nextInt();
            }
            int count=0;
            int res=0;
            for(int i=0;i<n;i++){
                if(chef[i]>0 && chefina[i]>0){
                    count++;
                }else{
                    if(count>0){
                    if(count>res){
                        res = count;
                    }
                    count=0;
                  }
                }
                if(count>res){
                    res = count;
                }
                
            }
            System.out.println(res);
        }
        sc.close();
    }
}
