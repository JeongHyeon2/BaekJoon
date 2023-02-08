import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int totalCost = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int sum =0;
        for(int i=0;i<count;i++){
            st = new StringTokenizer(br.readLine());
            sum+=(Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()));
        }
        if(sum==totalCost) bw.write("Yes");
        else bw.write("No");

        bw.flush();
    }
}
