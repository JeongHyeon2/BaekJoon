import java.io.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int winner = Integer.parseInt(st.nextToken());

        Integer [] arr = new Integer[size];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());



      bw.write(String.valueOf(arr[winner-1]));
      bw.flush();

    }



}

