
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb ;
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            sb=new StringBuffer();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #");sb.append(i+1);sb.append(": ");sb.append(a);sb.append(" + ");sb.append(b);sb.append(" = ");sb.append(a+b);
            sb.append("\n");
            bw.write(sb.toString());
        }
        bw.flush();

    }
}

