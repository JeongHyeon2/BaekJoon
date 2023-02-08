import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        int h, w, n, testCase;
        StringBuffer sb;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            sb = new StringBuffer();
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            if(n%h==0) sb.append(h);
            else sb.append(n%h);
            if ((int) Math.ceil((double) n / (double) h) < 10) sb.append("0");
            sb.append((int) Math.ceil((double) n / (double) h));


            bw.write(sb.toString());
            bw.write("\n");
        }

        bw.flush();

    }
}
