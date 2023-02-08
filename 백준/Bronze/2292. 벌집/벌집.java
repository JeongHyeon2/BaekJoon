import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(br.readLine());
        int i=1;
        num--;
        while(num>0){
            num-=6*i;
            i++;
        }
        bw.write(String.valueOf(i));
        bw.flush();
    }
}

