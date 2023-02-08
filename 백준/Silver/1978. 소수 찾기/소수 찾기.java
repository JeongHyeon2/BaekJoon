import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int primeNumCount = 0;
        for(int i=0;i<count;i++){
            if(isPrimeNum(Integer.parseInt(st.nextToken()))) primeNumCount++;
        }


        bw.write(String.valueOf(primeNumCount));
        bw.flush();
    }
    public static boolean isPrimeNum(int num){
        if(num<2) return false;

        for (int i=2;i<=num/2;i++){
            if(num%i==0) return false;
        }
        return true;
    }

}

