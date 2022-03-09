import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if(num>1) {
            for (int i = 2; i <= num;) {
                if(num%i==0) {
                    num/=i;
                    bw.write(String.valueOf(i));
                    bw.write("\n");
                }else{
                    i++;
                }
            }
        }
        bw.flush();

    }

}