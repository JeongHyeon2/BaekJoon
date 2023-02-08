import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

       int fixedCost, variableCost,salesPrice, salesVolume;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer st;

       st = new StringTokenizer(br.readLine());
       fixedCost = Integer.parseInt(st.nextToken());
       variableCost = Integer.parseInt(st.nextToken());
       salesPrice = Integer.parseInt(st.nextToken());

       if(variableCost>=salesPrice) salesVolume=-1;
       else salesVolume = (int)((double)fixedCost/((double)salesPrice-(double)variableCost))+1;

       bw.write(String.valueOf(salesVolume));
       bw.flush();

       }
}
