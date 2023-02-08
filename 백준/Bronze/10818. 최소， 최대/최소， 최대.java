import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int min,max;
        min = Integer.parseInt(st.nextToken());
        max = min;

        for(int i=0;i<size-1;i++){
           int num= Integer.parseInt(st.nextToken());
           if(num>max) max = num;
           if(num<min) min = num;
        }
        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));
        bw.flush();


    }
}