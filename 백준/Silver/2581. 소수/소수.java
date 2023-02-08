import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int primeNumSum = 0;
        int minPrimeNum = 0;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for(int i = n; i<=m; i++){
            if(isPrimeNum(i)){
                primeNumSum+=i;
                if(minPrimeNum==0) minPrimeNum=i;
            }
        }
        if(primeNumSum!=0) {
            bw.write(String.valueOf(primeNumSum));
            bw.write("\n");
            bw.write(String.valueOf(minPrimeNum));
        }else{
            bw.write("-1");
        }
        
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

