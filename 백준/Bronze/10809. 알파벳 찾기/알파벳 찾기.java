import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int [] alpabetArr = new int[26];
        for(int i=0;i<alpabetArr.length;i++) alpabetArr[i]=-1;

        for(int i=0;i<s.length();i++){
            if(alpabetArr[s.charAt(i)-'a']==-1){
                alpabetArr[s.charAt(i)-'a']=i;
            }

        }

        for(int i=0;i<alpabetArr.length;i++){
            bw.write(alpabetArr[i]+"");
            bw.write(" ");
        }
        bw.flush();

    }

}
