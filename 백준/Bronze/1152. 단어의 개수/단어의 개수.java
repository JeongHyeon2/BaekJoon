import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().trim();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=32) flag = true;
        }
        if(flag) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 32) count++;
            }
            bw.write(String.valueOf(count + 1));
        }else{
            bw.write(String.valueOf(0));
        }
        bw.flush();

    }
}