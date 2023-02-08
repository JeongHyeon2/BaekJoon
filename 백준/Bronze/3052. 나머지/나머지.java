import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        final int number = 42;
        final int inputSize = 10;
        boolean [] arr = new boolean[number];
        for(int i=0;i<inputSize;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num%number]=true;
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==true) count++;
        }
        bw.write(String.valueOf(count));

        bw.flush();

    }
}