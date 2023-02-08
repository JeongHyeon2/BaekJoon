import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distanceToDestination = y - x;
            int max = (int) Math.sqrt(distanceToDestination);

            if (max == Math.sqrt(distanceToDestination))
                bw.write(String.valueOf(max * 2 - 1));
            else if (distanceToDestination <= max * max + max)
                bw.write(String.valueOf(max * 2));
            else
                bw.write(String.valueOf(max * 2 + 1));
            bw.write("\n");
            
        }

        bw.flush();

    }
}
