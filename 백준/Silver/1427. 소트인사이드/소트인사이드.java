import java.io.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int size = s.length();
        
        Integer [] arr = new Integer[size];

        for(int i=0;i<size;i++){
            arr[i]= Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
      for(int num:arr){
          bw.write(String.valueOf(num));
      }
      bw.flush();

    }
    
}

