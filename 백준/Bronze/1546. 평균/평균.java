import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double [] arr = new double[size];
        double max = arr[0] = Double.parseDouble(st.nextToken());
        for(int i=1;i<size;i++){
            arr[i]= Double.parseDouble(st.nextToken());
            if(max<arr[i]) max = arr[i];
        }
        double sum=0;
        for(int i =0;i<size;i++){
            arr[i] = arr[i]/max*100;
            sum+=arr[i];
        }
        bw.write(String.valueOf(sum/size));
        bw.flush();


    }
}