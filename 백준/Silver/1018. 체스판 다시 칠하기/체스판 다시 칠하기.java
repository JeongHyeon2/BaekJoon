import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean chess [][] =  new boolean[n][m];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                if(s.charAt(j)=='W') chess[i][j] = true;
                else chess[i][j]= false;
            }
        }

        int min=50*50;
        for(int x = 0;x<=n-8;x++) {
            for(int y=0;y<=m-8;y++) {
                int count = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0 && chess[i+x][j+y] == true) count++;
                            if (j % 2 != 0 && chess[i+x][j+y] == false) count++;
                        } else {
                            if (j % 2 != 0 && chess[i+x][j+y] == true) count++;
                            if (j % 2 == 0 && chess[i+x][j+y] == false) count++;
                        }
                    }
                }
                if(min>count) min=count;
                count=0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0 && chess[i+x][j+y] == false) count++;
                            if (j % 2 != 0 && chess[i+x][j+y] == true) count++;
                        } else {
                            if (j % 2 != 0 && chess[i+x][j+y] == false) count++;
                            if (j % 2 == 0 && chess[i+x][j+y] == true) count++;
                        }
                    }
                }
                if(min>count) min=count;
            }
        }
        bw.write(String.valueOf(min));
        bw.flush();
    }
}
