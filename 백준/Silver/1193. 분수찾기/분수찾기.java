import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
            
        int denominator=1; // 분모
        int numerator=1; // 분자
        int flag = 2;
        
        for(int i=1 ;i<num;i++){
            if(flag == 0){ // 오른쪽 위 대각선으로 이동
                denominator++;
                numerator--;
                if(numerator==1) flag = 2;
            }else if(flag == 1){ // 왼쪽 아래 대각선으로 이동
                numerator++;
                denominator--;
                if(denominator==1) flag = 3;

            }else if(flag == 2){ // 오른쪽 이동
                denominator++;
                flag = 1;
            }else{  // 아래로 이동
                numerator++;
                flag = 0;
            }
        }
        bw.write(String.valueOf(numerator));
        bw.write("/");
        bw.write(String.valueOf(denominator));
        bw.flush();
    }
}

