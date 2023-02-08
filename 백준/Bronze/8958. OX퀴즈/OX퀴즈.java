import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            char [] arr = br.readLine().toCharArray();
            int acc=0;
            int sum=0;
            for(int j=0;j<arr.length;j++){
              if(arr[j]=='O') {
                  if (j == 0) {
                      acc++;
                      sum+=acc;
                  } else {
                      acc++;
                      if (arr[j - 1] == 'O') {
                          sum += acc;
                      } else {
                          sum += 1;
                      }
                  }
              }
              else acc=0;
            }
            bw.write(sum+"");
            bw.write("\n");
        }
        bw.flush();

    }
}

