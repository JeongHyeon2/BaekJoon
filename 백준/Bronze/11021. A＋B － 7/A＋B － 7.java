import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #");
            bw.write(String.valueOf(i+1));
            bw.write(": ");
            bw.write(String.valueOf(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
            if(i!=num-1) bw.write("\n");
        }
        bw.flush();
    }
}
