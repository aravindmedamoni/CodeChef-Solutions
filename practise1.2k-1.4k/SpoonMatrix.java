import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpoonMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        String s = "spoon";
        while (t-->0) {
            byte r = sc.nextByte();
            byte c = sc.nextByte();
            String ans="No";
            char[][] matrix = new char[r][c];
            for(int i=0;i<r;i++){
                matrix[i] = sc.next().toLowerCase().toCharArray(); 
            }
            for(int i=0;i<r;i++){
                int strInd=0;
                int sInd=-1;
                for(int j=0;j<c;j++){
                    if(strInd<5 && matrix[i][j]==s.charAt(strInd)){
                        strInd++;
                        if(strInd==1){
                            sInd=j;
                        }
                    }else{
                        
                        if(strInd==5){
                            ans="Yes";
                            break;
                        }
                        if(sInd!=-1){
                            strInd=1;
                            Map<String,String> map = findSpoon(i+1, r, i, j, strInd, sInd, s, matrix);
                            ans = map.get("ans");
                            sInd = Integer.valueOf(map.get("sInd"));
                            strInd=Integer.valueOf(map.get("strInd"));
                        }
                        if(ans.equals("Yes")){
                            break;
                        }
                    }  
                    if(sInd==c-1){
                        strInd=1;
                        Map<String, String> map = findSpoon(i+1, r, i, j, strInd, sInd, s, matrix);
                        ans = map.get("ans");
                        sInd = Integer.valueOf(map.get("sInd"));
                        strInd=Integer.valueOf(map.get("strInd"));
                    } 
                }
                if(ans.equals("Yes") || strInd==5){
                    ans="Yes";
                    break;
                } 
            }
            if(ans.equals("Yes")){
                System.out.println("There is a spoon!");
            }else{
                System.out.println("There is indeed no spoon!");
            }
        }
        sc.close();
    }

    public static Map<String,String> findSpoon(int rTemp, int r,int i,int j,int strInd,int sInd,String s,char[][] matrix){
            String ans="No";
            for(;rTemp<r;rTemp++){
                if(strInd<5 && matrix[rTemp][sInd]==s.charAt(strInd)){
                    strInd++;
                }else{
                    if(strInd==5)
                    ans="Yes";
                    else{
                        if(matrix[i][j]=='s'){
                            //System.out.println("S value"+"j value "+j);
                            sInd=j;
                            //System.out.println("SIND "+sInd);
                            strInd=1;
                        }else
                        strInd=0;
                    }
                    break;
                }
                if(strInd==5){
                    ans="Yes";
                    break;
                }
            }
            Map<String,String> map = new HashMap<>();
            map.put("ans", ans);
            map.put("sInd", String.valueOf(sInd));
            map.put("strInd", String.valueOf(strInd));
            return map;
    }
}

// 1
// 6 10
// psponspoon
// spondjdjfe
// dodjdjewdf
// sdddjdjdjf 
// dndjekdkkf
// ddkekdkfff