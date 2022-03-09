import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

     int num = Integer.parseInt(br.readLine());
     bw.write(String.valueOf(fibonacci(num)));
     bw.flush();
    }
    public static int fibonacci(int n){
        if (n <= 1)
            return n;
        else
            return fibonacci(n-2) + fibonacci(n-1);
    }
}