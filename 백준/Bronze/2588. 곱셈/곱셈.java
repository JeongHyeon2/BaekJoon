import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = num1*((num2)%10);
        int num4 = num1*((num2-(num2)%10)%100);
        int num5 = num1*((num2/100)*100);

        bw.write(String.valueOf(num3));
        bw.write("\n");
        bw.write(String.valueOf(num4/10));
        bw.write("\n");
        bw.write(String.valueOf(num5/100));
        bw.write("\n");
        bw.write(String.valueOf(num3+num4+num5));



        bw.flush();
    }
}
