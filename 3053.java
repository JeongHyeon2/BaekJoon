import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int r = Integer.parseInt(br.readLine());
        bw.write(String.format("%.6f",r*r*Math.PI));
        bw.write("\n");
        bw.write(String.format("%.6f",(double)2*r*r));
        bw.flush();
    }


}