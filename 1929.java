import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());


        make_prime(num2);

        for(int i = num1; i < prime.length; i++) {
            if(prime[i] == false) {	
                bw.write(String.valueOf(i));
                bw.write("\n");
            }
        }
        bw.flush();
    }
    public static void make_prime(int n) {

        prime = new boolean[n + 1];
        if(n < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i] == true) {
                continue;
            }
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

    }

}