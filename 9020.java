import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            int num = Integer.parseInt(br.readLine());
            bw.write(goldbach(num));
            bw.write("\n");
            
        }
        bw.flush();
    }
    public static String goldbach(int num){
        boolean prime [] = new boolean[num*2+1];
        prime[0] = prime[1] = true;
        for(int i = 2;i*i<=num*2;i++){
            if(prime[i]==true) continue;
            for(int j=i*i;j<prime.length;j+=i){
                prime[j]=true;
            }
        }
      for(int i=num/2;i<num;i++){
          if(!prime[i] && !prime[num-i]) {
              return (num-i)+" "+i;
          }
      }
      return "";
    }

}