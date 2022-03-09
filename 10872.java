import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

     int num = Integer.parseInt(br.readLine());
     bw.write(String.valueOf(factorial(num)));
     bw.flush();
    }
    public static int factorial(int num){
        if(num<=1) return 1;
        else return num*factorial(num-1);
    }
}