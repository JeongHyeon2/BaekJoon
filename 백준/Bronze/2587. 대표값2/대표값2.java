import java.io.*;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 5;
        int [] arr = new int[size];
        int sum = 0;
        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr);


      bw.write(String.valueOf(sum/size));
      bw.write("\n");
      bw.write(String.valueOf(arr[2]));
        bw.flush();

    }



}

