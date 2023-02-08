import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

       int up, down, length;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer st;

       st = new StringTokenizer(br.readLine());
       up = Integer.parseInt(st.nextToken());
       down = Integer.parseInt(st.nextToken());
       length = Integer.parseInt(st.nextToken());

       bw.write(String.valueOf((int)Math.ceil(((double)(length-up)/(double)(up-down)))+1));
       bw.flush();

       }
}
