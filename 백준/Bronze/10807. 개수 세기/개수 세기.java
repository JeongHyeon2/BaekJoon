import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        String v = br.readLine();
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i].equals(v)) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        
    }
}