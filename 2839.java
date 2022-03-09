import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int unit1=3,unit2=5, MAX_SUGAR=5000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sugar = Integer.parseInt(br.readLine());

        int unit1Count=MAX_SUGAR,unit2count=MAX_SUGAR;
        for(int i=0;i<=Math.ceil((double)sugar/(double)unit1);i++){
           for(int j=0;j<=Math.ceil((double)sugar/(double)unit2);j++){
              if(sugar==unit1*i+unit2*j && i+j<unit1Count+unit2count){
                 unit1Count=i;
                 unit2count=j;
              }
           }
        }
      if(unit1Count+unit2count==2*MAX_SUGAR) bw.write(String.valueOf(-1));
      else bw.write(String.valueOf(unit1Count+unit2count));

      bw.flush();

    }
}
