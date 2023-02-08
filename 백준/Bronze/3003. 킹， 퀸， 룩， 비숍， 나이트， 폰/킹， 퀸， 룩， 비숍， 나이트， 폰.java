import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(String.valueOf(1-Integer.parseInt(st.nextToken())));
        bw.write(" ");
        bw.write(String.valueOf(1-Integer.parseInt(st.nextToken())));
        bw.write(" ");
        bw.write(String.valueOf(2-Integer.parseInt(st.nextToken())));
        bw.write(" ");
        bw.write(String.valueOf(2-Integer.parseInt(st.nextToken())));
        bw.write(" ");
        bw.write(String.valueOf(2-Integer.parseInt(st.nextToken())));
        bw.write(" ");
        bw.write(String.valueOf(8-Integer.parseInt(st.nextToken())));
        bw.flush();
    }
}
