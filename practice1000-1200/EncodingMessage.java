
//import java.util.Hashtable;
//problem code:ENCMSG
public class EncodingMessage {
    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        // Hashtable ht = new Hashtable<Character,Character>(){{
        //     put('a', 'z');
        //     put('b', 'y');
        //     put('c', 'x');
        //     put('d', 'w');
        //     put('e', 'v');
        //     put('f', 'u');
        //     put('g', 't');
        //     put('h', 's');
        //     put('i', 'r');
        //     put('j', 'q');
        //     put('k', 'p');
        //     put('l', 'o');
        //     put('m', 'n');
        //     put('n', 'm');
        //     put('o', 'l');
        //     put('p', 'k');
        //     put('q', 'j');
        //     put('r', 'i');
        //     put('s', 'h');
        //     put('t', 'g');
        //     put('u', 'f');
        //     put('v', 'e');
        //     put('w', 'd');
        //     put('x', 'c');
        //     put('y', 'b');
        //     put('z', 'a');
        // }};

        while(t-->0){
            int n = ir.nextInt();
            String s = ir.next();
            StringBuffer sb = new StringBuffer(s);
            for(int i=0;i<n-1;i +=2){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i+1));
                sb.setCharAt(i+1, temp);
            }
            for(int i=0;i<n;i++){
                //sb.setCharAt(i, ht.get(sb.charAt(i)).toString().charAt(0));
                sb.setCharAt(i, ((char)('z'+'a'-sb.charAt(i))));
            }
            System.out.println(sb);
        }
    }
}
