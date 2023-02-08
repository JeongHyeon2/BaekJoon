import java.io.*;

import java.util.StringTokenizer;

public class Main {

    static int size = 100;
    static boolean [][] matrix = new boolean[size][size];

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;



        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            draw(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        int m = 0;
      for(int i=0;i<size;i++){
          for(int j = 0;j<size;j++){
              if(matrix[i][j]) m++;
          }
      }
      bw.write(String.valueOf(m));
        bw.flush();

    }
    public static void draw(int num1,int num2){
        for(int i=size-num2;i>Math.max(0,size-num2-10);i--){
            for(int j = num1;j<Math.min(num1+10,size);j++){
                matrix[i][j]=true;
            }
        }
    }


}

