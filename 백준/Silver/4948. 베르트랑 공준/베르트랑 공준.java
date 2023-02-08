import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        while (num!=0){
            bw.write(String.valueOf(primeCount(num)));
            bw.write("\n");
            num = Integer.parseInt(br.readLine());
        }
        bw.flush();
    }
    public static int primeCount(int num){
        boolean prime [] = new boolean[num*2+1];
        prime[0] = prime[1] = true;
        for(int i = 2;i*i<=num*2;i++){
            if(prime[i]==true) continue;
            for(int j=i*i;j<prime.length;j+=i){
                prime[j]=true;
            }
        }
        int count = 0;
        for(int i=num+1;i<=2*num;i++){
            if(!prime[i]) count++;
        }

        return count;
    }


}