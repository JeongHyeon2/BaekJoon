import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String num1 = reverse(st.nextToken());
        String num2 = reverse(st.nextToken());
        
        if(num1.compareTo(num2)>0) bw.write(num1);
        else bw.write(num2);

        bw.flush();
    }
    public static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

}
