import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        
        int size = 9;
        int row=0,column=0;
        int max = 0;
        for(int i=0;i<size;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<size;j++){
                int num = Integer.parseInt(st.nextToken());
                if(max<num){
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.write("\n");
        bw.write(String.valueOf(row+1));
        bw.write(" ");
        bw.write(String.valueOf(column+1));
        bw.flush();

    }


}

