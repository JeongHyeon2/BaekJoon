import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[6];
        while(st.hasMoreTokens()) {
            arr[Integer.parseInt(st.nextToken()) - 1]++;
        }
        int count = arr[0];
        int idx = 0;
        for(int i=1;i<arr.length;i++){
            if(count<arr[i]){
                count=arr[i];
                idx = i;
            }
        }
        if(count == 3){
            bw.write(String.valueOf(10000+(idx+1)*1000));
        }else if(count == 2){
            bw.write(String.valueOf(1000+(idx+1)*100));
        }else{
            int max= 1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=1) max = i;
            }
            bw.write(String.valueOf((max+1)*100));
        }
        
        bw.flush();
    }
}
