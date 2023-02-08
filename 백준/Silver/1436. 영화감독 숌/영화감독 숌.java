import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String curNum = "666";
        int k = 666;
        for(int i=0;i<num;){
            if(String.valueOf(k).contains(curNum)) {
                i++;
            }
            k++;
        }
        bw.write(String.valueOf(k-1));
        bw.flush();
    }
}
