import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][] matrix1 = new int[n][m];
        int [][] matrix2 = new int[n][m];
        int [][] result = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m;j++){
                matrix1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m;j++){
                matrix2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            for(int j = 0; j<m;j++){
               result[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j = 0; j<m;j++){
                bw.write(String.valueOf(result[i][j]));
                bw.write(" ");
            }
            bw.write("\n");
        }


        bw.flush();
    }


}

