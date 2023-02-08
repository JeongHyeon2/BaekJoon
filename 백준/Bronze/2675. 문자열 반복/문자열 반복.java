import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            st = new StringTokenizer(br.readLine());
            int iterate = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j=0;j<s.length();j++) {
                for (int k = 0; k < iterate; k++){
                    bw.write(s.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }

}
