import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if(num>=90) bw.write("A");
        else if(80<=num && num<90) bw.write("B");
        else if(70<=num && num<80) bw.write("C");
        else if(60<=num && num<70) bw.write("D");
        else bw.write("F");

        bw.flush();
    }
}
