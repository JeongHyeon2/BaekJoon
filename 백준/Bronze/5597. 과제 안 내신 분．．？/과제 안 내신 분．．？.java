import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        final int size = 30;
        final int notSubmitted = 2;
        boolean [] arr = new boolean[size];
        for(int i=0;i<size-notSubmitted;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num-1]=true;
        }
        for(int i=0;i<size;i++){
           if(arr[i]==false){
               bw.write(String.valueOf(i+1));
               bw.write("\n");
           }
        }
        bw.flush();

    }
}