import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger num1 = new BigInteger(st.nextToken());
        BigInteger num2 = new BigInteger(st.nextToken());
        
        bw.write(String.valueOf(num1.add(num2)));
        bw.flush();
    }
}

