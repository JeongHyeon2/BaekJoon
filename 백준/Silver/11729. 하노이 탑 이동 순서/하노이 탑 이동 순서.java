import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf((int)Math.pow(2,N)-1+"\n"));
        Hanoi(N,1,2,3);
        bw.flush();
        bw.close();
    }

    static void Hanoi(int N, int start, int mid, int to) throws IOException {

        if (N == 1) {
            bw.write(start + " " + to + "\n");
            return;
        }

        Hanoi(N - 1, start, to, mid);
       bw.write(start + " " + to + "\n");
        Hanoi(N - 1, mid, start, to);

    }
}