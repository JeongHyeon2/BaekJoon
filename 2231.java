import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        boolean isExist = false;
        for(int i=1;i<num;i++){
            String s = String.valueOf(i);
            int sum=i;
            for(int j=0;j<s.length();j++){
                sum+=s.charAt(j)-'0';
            }
            if(sum==num){
                isExist = true;
                bw.write(String.valueOf(i));
                break;
            }
        }
        if(!isExist) bw.write("0");
        bw.flush();
    }
}