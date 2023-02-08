import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int max = Integer.parseInt(br.readLine());
        int max_i=0;
        final int size = 9;
        for(int i=1;i<size;i++){
            int num = Integer.parseInt(br.readLine());
            if(max<num){
                max = num;
                max_i=i;
            }
        }

        bw.write(String.valueOf(max));
        bw.write("\n");
        bw.write(String.valueOf(max_i+1));
        bw.flush();


    }
}