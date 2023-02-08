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
        int cur_hour = Integer.parseInt(st.nextToken());
        int cur_min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        bw.write(String.valueOf((cur_hour+(time+cur_min)/60)%24));
        bw.write(" ");
        bw.write(String.valueOf((cur_min+time%60)%60));


        bw.flush();
    }
}
